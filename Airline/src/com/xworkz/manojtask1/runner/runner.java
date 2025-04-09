package com.xworkz.manojtask1.runner;

import com.xworkz.manojtask1.external.Badgestate;
import com.xworkz.manojtask1.external.Keychainstate;
import com.xworkz.manojtask1.external.Mutantstate;
import com.xworkz.manojtask1.external.Tankstate;
import com.xworkz.manojtask1.internal.Badgerunner;
import com.xworkz.manojtask1.internal.Keychainrunner;
import com.xworkz.manojtask1.internal.Tankrunner;
import com.xworkz.manojtask1.internal.mutantrunner;

public class runner {
    public static void main(String[] args) {
        System.out.println("class for muntants");
        Mutantstate mutantstate=new Mutantstate();
        mutantstate.Power();
        mutantrunner mutantrunner=new mutantrunner();
        mutantrunner.mutant2();
        System.out.println("class for Keychain");
        Keychainstate keychainstate=new Keychainstate();
        keychainstate.chain();
        Keychainrunner keychainrunner=new Keychainrunner();
        keychainrunner.keychain2();
        System.out.println("class for Tank");
        Tankstate tankstate=new Tankstate();
        tankstate.water();
        Tankrunner tankrunner=new Tankrunner();
        tankrunner.tank2();
        System.out.println("class for Badge");
        Badgestate Badgestate=new Badgestate();
        Badgestate.badge();
        Badgerunner badgerunner=new Badgerunner();
        badgerunner.Badge2();




    }
}
