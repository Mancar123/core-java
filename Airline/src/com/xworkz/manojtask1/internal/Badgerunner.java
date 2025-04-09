package com.xworkz.manojtask1.internal;

public class Badgerunner {
    public void Badge2 () {
        System.out.println("Badge Details");
        Badge badge = new Badge();
        badge.setDesign("Gold");
        badge.setIdNumber(1001);
        badge.setOwner("Manoj");
        badge.setOfficial(true);
        badge.setSize(5.5);
        badge.getDesign();
        badge.getIdNumber();
        badge.getOwner();
        badge.getOfficial();
        badge.getSize();
    }
}
