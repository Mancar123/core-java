package com.xworkz.manoj.task3.internal;

public class Zara {
    private  String modelName;
    private int batteryCapacity;

    public  Zara(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Zara(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
        public void style() {
            System.out.println("Zara offers fast-fashion trends.");
        }
    }

