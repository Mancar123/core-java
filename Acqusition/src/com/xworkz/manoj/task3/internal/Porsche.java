package com.xworkz.manoj.task3.internal;

public class Porsche {
    private  String modelName;
    private int batteryCapacity;

    public  Porsche(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Porsche(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
        public void handling() {
            System.out.println("Porsche has precision handling.");
        }
    }

