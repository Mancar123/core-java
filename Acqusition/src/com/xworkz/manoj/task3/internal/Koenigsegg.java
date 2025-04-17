package com.xworkz.manoj.task3.internal;

public class Koenigsegg {
    private  String modelName;
    private int batteryCapacity;

    public  Koenigsegg(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Koenigsegg(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void speedInnovation() {
        System.out.println("Koenigsegg pushes boundaries of hypercars.");
    }
}
