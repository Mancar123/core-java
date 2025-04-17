package com.xworkz.manoj.task3.internal;

public class Aptera{
    private  String modelName;
    private int batteryCapacity;

    public  Aptera(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Aptera(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void solarEfficiency() {
        System.out.println("Aptera vehicles use solar technology for driving.");
    }
}
