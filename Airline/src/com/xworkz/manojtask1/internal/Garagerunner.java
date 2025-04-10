package com.xworkz.manojtask1.internal;

public class Garagerunner {
        public static void garage2() {
            System.out.println("Garage Details");
            Garage garage = new Garage();
            garage.setLocation("Downtown");
            garage.setCapacity(50);
            garage.setOwner("Manoj");
            garage.setOpen(true);
            garage.setArea(200.5);
            garage.getLocation();
            garage.getCapacity();
            garage.getOwner();
            garage.getOpen();
            garage.getArea();
        }
    }

