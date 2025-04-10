package com.xworkz.manojtask1.external;

import com.xworkz.manojtask1.internal.Jet;

public class JetState {
    public static void jet() {
        Jet jet = new Jet();
        System.out.println("Jet Details");
        jet.getModel();
        jet.getCapacity();
        jet.getAirline();
        jet.getCommercial();
        jet.getSpeed();
    }
}

