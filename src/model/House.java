package model;

import java.time.LocalDate;
public final class House extends Estate {
    private double plotArea;
    public House(String street, String houseNumber, String town, String postalCode, double area, double price, LocalDate offerDate, double plotArea){
        super(street, houseNumber, town, postalCode, area, price, offerDate);
        this.plotArea = plotArea;
    }
    public double getPlotArea() {
        return plotArea;
    }
    public String toString() {
        return "House offer: " + super.toString() + ", Plot area: " + plotArea + "m^2";
    }
}