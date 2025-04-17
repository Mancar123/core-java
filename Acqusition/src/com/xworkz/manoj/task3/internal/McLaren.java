package com.xworkz.manoj.task3.internal;

public class McLaren {
    private  String modelName;
    private int batteryCapacity;

    public  McLaren(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public McLaren(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void aerodynamics() {
        System.out.println("McLaren has advanced aerodynamics.");
    }

}
