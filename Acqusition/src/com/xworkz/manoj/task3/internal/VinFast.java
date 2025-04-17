package com.xworkz.manoj.task3.internal;

public class VinFast {
    private  String modelName;
    private int batteryCapacity;

    public  VinFast(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public VinFast(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void emergingEVInnovation() {
        System.out.println("VinFast is bringing EV technology to a global scale.");
    }
}
