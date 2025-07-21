package view;
import controller.OfferList;
import model.Estate;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void menu() {
        System.out.println("Select function:");
        System.out.println("1. Add a house for sale offer");
        System.out.println("2. Add an apartment for sale offer");
        System.out.println("3. Show house sales offers");
        System.out.println("4. Show apartment sales offers");
        System.out.println("0. Exit");
    }
    public static void addSellHouseOffer(OfferList offerList, Scanner scanner) {
        System.out.print("Street: ");
        String street = scanner.nextLine();
        System.out.print("House number: ");
        String houseNumber = scanner.nextLine();
        System.out.print("Town: ");
        String town = scanner.nextLine();
        System.out.print("Postal code: ");
        String code = scanner.nextLine();
        System.out.print("House area (m2): ");
        double houseArea = scanner.nextDouble();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Plot area (m2): ");
        double plotArea = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Offer validity date (YYYY-MM-DD): ");
        LocalDate validityDate = LocalDate.parse(scanner.nextLine());

        offerList.addOffer(street, houseNumber, town, code, houseArea, price, validityDate, plotArea);

        System.out.println("\nHouse sell offer was added.");
        System.out.println(" ");
    }
    public static void addSellApartmentOffer(OfferList offerList, Scanner scanner) {
        System.out.print("Street: ");
        String street = scanner.nextLine();
        System.out.print("House number: ");
        String houseNumber = scanner.nextLine();
        System.out.print("Apartment number: ");
        String apartmentNumber = scanner.nextLine();
        System.out.print("Town: ");
        String town = scanner.nextLine();
        System.out.print("Postal code: ");
        String code = scanner.nextLine();
        System.out.print("Apartment area (m2): ");
        double apartmentArea = scanner.nextDouble();
        System.out.print("Floor number: ");
        int floor = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Offer validity date (YYYY-MM-DD): ");
        LocalDate validityDate = LocalDate.parse(scanner.nextLine());

        offerList.addOffer(street, houseNumber, town, code, apartmentArea, price, validityDate, apartmentNumber, floor);

        System.out.println("\nApartment sell offer was added.");
        System.out.println(" ");
    }
    public static void showHouseSellOffers(OfferList offerList, Scanner scanner) {
        System.out.print("Enter the town: ");
        String town = scanner.nextLine();
        System.out.print("Enter the minimal house area (m2): ");
        double houseArea = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("House sell offers in " + town + ", house area >= " + houseArea + " m2:");
        List<Estate> result = offerList.filterOffers(town, houseArea);
        for (Estate offer : result) { System.out.println(offer); }
    }
    public static void showApartmentSellOffers(OfferList offerList, Scanner scanner) {
        System.out.print("Enter the town: ");
        String town = scanner.nextLine();
        System.out.print("Enter the maximum price: ");
        double maxPrice = scanner.nextDouble();
        System.out.print("Enter minimum floor: ");
        int minFloor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Apartment sell offers in " + town + ", price <= " + maxPrice + " $, floor >= " + minFloor + ":");
        List<Estate> result = offerList.filterOffers(town, maxPrice, minFloor);
        for (Estate offer : result) { System.out.println(offer); }
    }
    public static void main(String[] args) {
        System.out.println("House and apartment sales offers\n");
        Scanner scanner = new Scanner(System.in);
        OfferList offerList = new OfferList();
        boolean run = true;
        do {
            menu();
            String selection = scanner.nextLine();
            System.out.println(" ");
            switch (selection) {
                case "1" -> addSellHouseOffer(offerList, scanner);
                case "2" -> addSellApartmentOffer(offerList, scanner);
                case "3" -> showHouseSellOffers(offerList, scanner);
                case "4" -> showApartmentSellOffers(offerList, scanner);
                case "0" -> run = false;
                default -> System.out.println("Choose valid option.\n");
            }
        } while (run);
    }
}
