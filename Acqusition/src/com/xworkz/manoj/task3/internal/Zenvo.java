package com.xworkz.manoj.task3.internal;

public class Zenvo {

    private  String modelName;
    private int batteryCapacity;

    public  Zenvo(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Zenvo(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void extremePerformance() {
        System.out.println("Zenvo produces limited-edition hypercars.");
    }

    public void aerodynamicActiveWing() {

    }
}
