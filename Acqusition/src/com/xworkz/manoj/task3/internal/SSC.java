package com.xworkz.manoj.task3.internal;

public class SSC {
    private  String modelName;
    private int batteryCapacity;

    public  SSC(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public SSC(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void highSpeedEngineering() {
        System.out.println("SSC specializes in ultra-high-speed hypercars.");
    }
}
