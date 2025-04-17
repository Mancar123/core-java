package com.xworkz.manoj.task3.internal;

public class Genesis {
    private  String modelName;
    private int batteryCapacity;

    public  Genesis(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Genesis(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void executiveComfort() {
        System.out.println("Genesis offers top-tier executive comfort.");
    }

}
