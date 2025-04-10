package com.xworkz.manojtask1.internal;

public class Jetrunner {
        public void jetInfo() {
            System.out.println("Jet Details");
            Jet jet = new Jet();
            jet.setModel("Falcon X");
            jet.setCapacity(200);
            jet.setAirline("Sky Airlines");
            jet.setCommercial(true);
            jet.setSpeed(950.5);
            jet.getModel();
            jet.getCapacity();
            jet.getAirline();
            jet.getCommercial();
            jet.getSpeed();
        }
    }

