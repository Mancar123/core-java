package com.xworkz.manoj.task3.internal;

public class Nissan {

    private  String modelName;
    private int batteryCapacity;

    public  Nissan(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Nissan(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void technology() {
        System.out.println("Nissan focuses on advanced driving tech.");
    }
}

