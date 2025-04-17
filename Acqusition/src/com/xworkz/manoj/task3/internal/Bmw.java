package com.xworkz.manoj.task3.internal;

public class Bmw {
    private  String modelName;
    private int batteryCapacity;

    public  Bmw(){}

    public String toString() {
        System.out.println("running toString in class");
        return " Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Bmw(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
        public void drivingExperience() {
            System.out.println("BMW focuses on driving pleasure.");
        }
    }
