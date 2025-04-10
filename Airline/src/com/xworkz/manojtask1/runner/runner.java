package com.xworkz.manojtask1.runner;


import com.xworkz.manojtask1.external.*;
import com.xworkz.manojtask1.internal.*;


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
        System.out.println("class for postoffice");
        Postofficestate postofficestate=new Postofficestate();
        Postofficestate.Post2();
        Postofficerunner postofficerunner=new Postofficerunner();
        Postofficerunner.Postoffice2();
        System.out.println("class for Occupation");
        Occupationstate occupationstate=new Occupationstate();
        Occupationstate.jobDetails();
        Occupationrunner Occupationrunner = new Occupationrunner();
        Occupationrunner.occupation2();
        System.out.println("class for Jet");
        JetState jetState=new JetState();
        JetState.jet();
        Jetrunner Jetrunner = new Jetrunner();
        Jetrunner.jetInfo();
        System.out.println("class for Garage");
        Garagestate garagestate=new Garagestate();
        Garagestate.garageInfo();
        Garagerunner garagerunner = new Garagerunner();
        Garagerunner.garage2();
        System.out.println("class for Gym");
        Gymstate gymstate=new Gymstate();
        Gymstate.gymstrength();
        Gymrunner gymrunner = new Gymrunner();
        Gymrunner.gymDetails();
        System.out.println("class for Apartment");
        Apartmentstate gapartmentstate=new Apartmentstate();
        Apartmentstate.apartmentInfo();
        Apartmentrunner apartmentrunner = new Apartmentrunner();
        Apartmentrunner.apartmentInfo();













    }
}
