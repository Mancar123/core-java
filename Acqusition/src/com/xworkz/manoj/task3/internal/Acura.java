package com.xworkz.manoj.task3.internal;

public class Acura {
    private  String modelName;
    private int batteryCapacity;

    public  Acura(){}

    public String toString() {
        System.out.println("running toString in Acura class");
        return "Acura Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Acura(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;
    }
        public void precision() {
            System.out.println("Acura delivers precision-crafted performance.");
        }


    }
