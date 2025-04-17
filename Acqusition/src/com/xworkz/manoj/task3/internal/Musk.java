package com.xworkz.manoj.task3.internal;

public class Musk {
    private  String modelName;
    private int batteryCapacity;

    public  Musk(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Musk(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
        public void display() {
            System.out.println("Base class method");
        }
    }


