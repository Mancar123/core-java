package com.xworkz.manoj.task3.internal;

public class Mahindra {
    private  String modelName;
    private int batteryCapacity;

    public  Mahindra(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Mahindra(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void reliability() {
        System.out.println("Mahindra SUVs are tough and reliable.");
    }
}
