package com.xworkz.manoj.task3.internal;

public class Hennessey {
    private  String modelName;
    private int batteryCapacity;

    public  Hennessey(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Hennessey(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void horsepower() {
        System.out.println("Hennessey specializes in high-horsepower upgrades.");
    }
}
