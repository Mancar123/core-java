package com.xworkz.manoj.task3.internal;

public class ForceMotors {
    private  String modelName;
    private int batteryCapacity;

    public  ForceMotors(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public ForceMotors(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void extremeDurability() {
        System.out.println("Force Motors builds high-strength vehicles.");
    }

}
