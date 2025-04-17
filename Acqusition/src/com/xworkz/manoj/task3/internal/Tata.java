package com.xworkz.manoj.task3.internal;

public class Tata {
    private  String modelName;
    private int batteryCapacity;

    public  Tata(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Tata(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void durability() {
        System.out.println("Tata cars are known for their robustness.");
    }

}
