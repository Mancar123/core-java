package com.xworkz.manoj.task3.internal;

public class Volvo {
    private  String modelName;
    private int batteryCapacity;

    public  Volvo(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Volvo(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void safety() {
        System.out.println("Volvo prioritizes safety above all.");
    }

    public void autoBraking() {
    }
}
