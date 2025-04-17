package com.xworkz.manoj.task3.internal;

public class HindustanMotors {
    private  String modelName;
    private int batteryCapacity;

    public  HindustanMotors(){}

    public String toString() {
        System.out.println("running toString in class");
        return " Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public HindustanMotors(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void legacy() {
        System.out.println("Hindustan Motors created India's most famous car.");
    }
}
