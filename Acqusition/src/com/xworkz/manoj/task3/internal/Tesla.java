package com.xworkz.manoj.task3.internal;

public class Tesla {
    private  String modelName;
    private int batteryCapacity;

    public Tesla(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Tesla(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }

        public void autopilot() {
            System.out.println("Tesla supports autonomous driving.");
        }
    }

