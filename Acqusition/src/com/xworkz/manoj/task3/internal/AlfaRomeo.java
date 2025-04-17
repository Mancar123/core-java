package com.xworkz.manoj.task3.internal;

public class AlfaRomeo {
    private  String modelName;
    private int batteryCapacity;

    public  AlfaRomeo(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public AlfaRomeo(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void agility() {
        System.out.println("Alfa Romeo cars are known for agility.");
    }

}
