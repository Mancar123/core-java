package com.xworkz.manojtask1.external;

import com.xworkz.manojtask1.internal.Garage;

public class Garagestate {
        public static void garageInfo() {
            System.out.println("Garage Details");
            Garage garages = new Garage();
            garages.getLocation();
            garages.getCapacity();
            garages.getOwner();
            garages.getOpen();
            garages.getArea();
        }
    }


