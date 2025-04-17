package com.xworkz.manoj.task3.internal;

public class Ferrari {
    private  String modelName;
    private int batteryCapacity;

    public  Ferrari(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Ferrari(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
        public void speed() {
            System.out.println("Ferrari class method");
        }
    }

