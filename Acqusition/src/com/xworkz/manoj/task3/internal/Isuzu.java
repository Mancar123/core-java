package com.xworkz.manoj.task3.internal;

public class Isuzu {
    private  String modelName;
    private int batteryCapacity;

    public  Isuzu(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Isuzu(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void dependableEngineering() {
        System.out.println("Isuzu vehicles focus on reliability and utility.");
    }
}
