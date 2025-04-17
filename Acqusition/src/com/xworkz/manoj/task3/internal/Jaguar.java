package com.xworkz.manoj.task3.internal;

public class Jaguar {
    private  String modelName;
    private int batteryCapacity;

    public  Jaguar(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Jaguar(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void elegancePerformance() {
        System.out.println("Jaguar merges elegance with performance.");
    }
}
