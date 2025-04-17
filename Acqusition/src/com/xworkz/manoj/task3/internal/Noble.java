package com.xworkz.manoj.task3.internal;

public class Noble {
    private  String modelName;
    private int batteryCapacity;

    public  Noble(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Noble(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void pureDrivingExperience() {
        System.out.println("Noble vehicles focus on driver engagement.");
    }
}
