package model;

import java.time.LocalDate;
public sealed abstract class Estate permits Apartment, House {
    private String street;
    private String houseNumber;
    private String town;
    private String postalCode;
    private double area;
    private double price;
    private LocalDate offerDate;

    public Estate(String street, String houseNumber, String town, String postalCode, double area, double price, LocalDate offerDate){
        this.street = street;
        this.houseNumber = houseNumber;
        this.town = town;
        this.postalCode = postalCode;
        this.area = area;
        this.price = price;
        this.offerDate = offerDate;
    }

    public String getStreet() {
        return street;
    }
    public String getHouseNumber() {
        return houseNumber;
    }
    public String getTown() {
        return town;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public double getArea() {
        return area;
    }
    public double getPrice() {
        return price;
    }
    public LocalDate getOfferDate() {
        return offerDate;
    }

    public String toString() {
        return "Postal code: " + postalCode + ", Town: " + town + ", Street: " + street + " " + houseNumber + ", Area: " + area +
                " m2, Price: " + price + "$, Offer date: " + offerDate;
    }
}