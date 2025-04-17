package com.xworkz.manoj.task3.internal;

public class Cadillac {
    private  String modelName;
    private int batteryCapacity;

    public  Cadillac(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Cadillac(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void premiumDesign() {
        System.out.println("Cadillac is known for premium craftsmanship.");
    }


}