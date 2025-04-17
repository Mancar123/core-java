package com.xworkz.manoj.task3.internal;

public class Pagani {
    private  String modelName;
    private int batteryCapacity;

    public  Pagani(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Pagani(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void handcraftedArt() {
        System.out.println("Pagani cars are handcrafted like masterpieces.");
    }

}
