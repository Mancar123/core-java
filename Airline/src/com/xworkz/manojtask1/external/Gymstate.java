package com.xworkz.manojtask1.external;

import com.xworkz.manojtask1.internal.Gym;

public class Gymstate {
    public static void gymstrength() {
        System.out.println("Gym Strength");
        Gym gyms = new Gym();
        gyms.getName();
        gyms.getSpecialty();
        gyms.getSize();
        gyms.getMembers();
        gyms.getOpen();
    }
}

