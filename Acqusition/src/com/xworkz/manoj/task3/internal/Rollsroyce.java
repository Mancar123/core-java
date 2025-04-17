package com.xworkz.manoj.task3.internal;

public class Rollsroyce {
    private  String modelName;
    private int batteryCapacity;

    public  Rollsroyce(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Rollsroyce(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }

        public void luxury() {
            System.out.println("Rolls-Royce defines luxury.");
        }
    }

