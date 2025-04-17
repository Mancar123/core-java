package com.xworkz.manoj.task3.internal;

public class BMWMotorrad {
    private  String modelName;
    private int batteryCapacity;

    public  BMWMotorrad(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public BMWMotorrad(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void premiumRideExperience() {
        System.out.println("BMW Motorrad offers luxury touring motorcycles.");
    }
}
