package com.xworkz.manoj.task3.internal;

public class Adidas {
    private  String Name;
    private int no_of_stores;

    public  Adidas(){}

    public String toString() {
        System.out.println("running toString in class");
        return "adidas Model: " + Name + ", no_of_stores: " + no_of_stores;
    }


    public Adidas(String Name, int no_of_stores) {
        this.Name = Name;
        this.no_of_stores = no_of_stores;

    }
    public void performance() {
        System.out.println("Adidas is known for performance-driven fashion.");
    }

}
