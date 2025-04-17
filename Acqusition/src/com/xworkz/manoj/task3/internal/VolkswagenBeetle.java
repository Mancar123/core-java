package com.xworkz.manoj.task3.internal;

public class VolkswagenBeetle {
    private  String modelName;
    private int batteryCapacity;

    public  VolkswagenBeetle(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public VolkswagenBeetle(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void designLegacy() {
        System.out.println("Beetle is one of the most iconic car designs.");
    }
}
