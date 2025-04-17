package com.xworkz.manoj.task3.internal;

public class OlaElectric {
    private  String modelName;
    private int batteryCapacity;

    public  OlaElectric(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public OlaElectric(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void innovationInEV() {
        System.out.println("Ola Electric is shaping the future of mobility.");
    }
}
