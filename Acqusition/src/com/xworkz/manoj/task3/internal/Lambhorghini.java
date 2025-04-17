package com.xworkz.manoj.task3.internal;

public class Lambhorghini {
    private  String modelName;
    private int batteryCapacity;

    public  Lambhorghini(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Lambhorghini(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }

        public void aerodynamics() {
            System.out.println("Lamborghini has cutting-edge aerodynamics.");
        }
    }




