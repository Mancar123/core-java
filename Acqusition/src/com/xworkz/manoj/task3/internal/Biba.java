package com.xworkz.manoj.task3.internal;

public class Biba {
    private  String Name;
    private int no_of_outlets;

    public  Biba(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + Name + ", no_of_outlets: " + no_of_outlets ;
    }


    public Biba(String Name, int no_of_outlets) {
        this.Name = Name;
        this.no_of_outlets = no_of_outlets;

    }
    public void elegance() {
        System.out.println("Biba blends ethnic elegance with modern fashion.");
    }
}
