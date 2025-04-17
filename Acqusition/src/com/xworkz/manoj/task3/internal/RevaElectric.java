package com.xworkz.manoj.task3.internal;

public class RevaElectric {
    private  String modelName;
    private int batteryCapacity;

    public  RevaElectric(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public RevaElectric(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void pioneerEV() {
        System.out.println("Reva Electric pioneered India's EV market.");
    }

    public void batteryEfficiency() {

    }
}
