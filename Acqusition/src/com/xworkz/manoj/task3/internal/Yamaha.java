package com.xworkz.manoj.task3.internal;

public class Yamaha {
    private  String modelName;
    private int batteryCapacity;

    public  Yamaha(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Yamaha(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void racingTechnology() {
        System.out.println("Yamaha bikes are built for speed and agility.");
    }
}
