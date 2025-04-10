package com.xworkz.manojtask1.internal;

public class Apartmentrunner {
    public void apartmentInfo() {
        System.out.println("Apartment Details");
        Apartment apartment = new Apartment();
        apartment.setOwner("Manoj");
        apartment.setType("Penthouse");
        apartment.setArea(1500.5);
        apartment.setFloorNumber(5);
        apartment.setOccupied(true);
        apartment.getOwner();
        apartment.getType();
        apartment.getArea();
        apartment.getFloorNumber();
        apartment.getOccupied();
    }

}
