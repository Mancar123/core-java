package com.xworkz.manoj.task3.internal;

public class Corvette {
    private  String modelName;
    private int batteryCapacity;

    public  Corvette(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Corvette(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void speed() {
        System.out.println("Corvette delivers pure speed.");
    }

}
