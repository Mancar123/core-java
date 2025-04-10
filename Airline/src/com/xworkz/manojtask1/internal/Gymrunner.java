package com.xworkz.manojtask1.internal;

public class Gymrunner {
    public static void gymDetails() {
        System.out.println("Gym Strength");
        Gym gym = new Gym();
        gym.setName("Iron Fitness");
        gym.setSpecialty("Weightlifting");
        gym.setSize(500.0);
        gym.setMembers(150);
        gym.setOpen(true);
        gym.getName();
        gym.getSpecialty();
        gym.getSize();
        gym.getMembers();
        gym.getOpen();
    }
}

