package com.xworkz.manoj.task3.internal;

public class Mitsubishi {
    private  String modelName;
    private int batteryCapacity;

    public  Mitsubishi(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Mitsubishi(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void reliability() {
        System.out.println("Mitsubishi is built for reliable performance.");
    }
}
