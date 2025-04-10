package com.xworkz.manojtask1.external;

import com.xworkz.manojtask1.internal.Apartment;

public class Apartmentstate {
        public static void apartmentInfo() {
            Apartment apartment = new Apartment();
            System.out.println("Apartment Details");
            apartment.getOwner();
            apartment.getType();
            apartment.getArea();
            apartment.getFloorNumber();
            apartment.getOccupied();
        }
    }


