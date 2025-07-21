package controller;
import model.Apartment;
import model.Estate;
import model.House;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class OfferList {
    private ArrayList<Estate> offers;
    public OfferList(){
        offers = new ArrayList<>();
    }
    public void addOffer(String street, String houseNumber, String town, String code, double houseArea, double price, LocalDate validityDate, double plotArea) {
        House house = new House(street, houseNumber, town, code, houseArea, price, validityDate, plotArea);
        offers.add(house);
    }
    public void addOffer(String street, String houseNumber, String town, String code, double apartmentArea, double price, LocalDate validityDate, String apartmentNumber, int floor) {
        Apartment flat = new Apartment(street, houseNumber, town, code, apartmentArea, price, validityDate, apartmentNumber, floor);
        offers.add(flat);
    }
    public List<Estate> filterOffers(String town, double area) {
        LocalDate today = LocalDate.now();
        List<Estate> result = filter(offer -> (offer instanceof House) && offer.getTown().equalsIgnoreCase(town)
                && offer.getArea() >= area && !offer.getOfferDate().isBefore(today));
        return result;
    }
    public List<Estate> filterOffers(String town, double maxPrice, int minFloor) {
        LocalDate today = LocalDate.now();
        List<Estate> result = filter(offer -> (offer instanceof Apartment) && offer.getTown().equalsIgnoreCase(town)
                && offer.getPrice() <= maxPrice && ((Apartment) offer).getFloorNumber() >= minFloor && !offer.getOfferDate().isBefore(today));
        return result;
    }
    private List<Estate> filter(Predicate<Estate> predicate) {
        List<Estate> result = new ArrayList<>();
        for (Estate offer : offers) {
            if (predicate.test(offer)) {
                result.add(offer);
            }
        }
        return result;
    }
}
