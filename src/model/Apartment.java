package model;

import java.time.LocalDate;
public final class Apartment extends Estate {
    private String apartmentNumber;
    private int floorNumber;
    public Apartment(String street, String houseNumber, String town, String postalCode, double area, double price, LocalDate offerDate, String apartmentNumber, int floorNumber){
        super(street, houseNumber, town, postalCode, area, price, offerDate);
        this.apartmentNumber = apartmentNumber;
        this.floorNumber = floorNumber;
    }
    public String getApartmentNumber() {
        return apartmentNumber;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public String toString() {
        return "Apartment offer: " + super.toString() + ", Apartment number: " + apartmentNumber + ", Floor number: " + floorNumber;
    }
}