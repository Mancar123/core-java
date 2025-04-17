package com.xworkz.manoj.task3.internal;

public class Canoo {
    private  String modelName;
    private int batteryCapacity;

    public  Canoo(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Canoo(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void modularVehicleTech() {
        System.out.println("Canoo is redefining EV design with modular architecture.");
    }
}
