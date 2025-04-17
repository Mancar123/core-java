package com.xworkz.manoj.task3.internal;

public class Chevrolet {
    private  String modelName;
    private int batteryCapacity;

    public  Chevrolet(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Chevrolet(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void reliability() {
        System.out.println("Chevrolet cars are reliable.");
    }
}
