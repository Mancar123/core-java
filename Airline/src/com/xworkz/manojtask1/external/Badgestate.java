package com.xworkz.manojtask1.external;

import com.xworkz.manojtask1.internal.Badge;

public class Badgestate {
    public void badge () {
        System.out.println("Badge Details");
        Badge badges = new Badge();
        badges.getDesign();
        badges.getIdNumber();
        badges.getOwner();
        badges.getOfficial();
        badges.getSize();
    }

}
