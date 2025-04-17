package com.xworkz.manoj.task3.internal;

public class Bugatti {
    private  String modelName;
    private int batteryCapacity;

    public  Bugatti(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Bugatti(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void acceleration() {
        System.out.println("Bugatti accelerates at breakneck speeds.");
    }
}

