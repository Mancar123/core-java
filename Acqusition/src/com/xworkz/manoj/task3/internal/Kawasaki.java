package com.xworkz.manoj.task3.internal;

public class Kawasaki {
    private  String modelName;
    private int batteryCapacity;

    public  Kawasaki(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Kawasaki(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void trackPerformance() {
        System.out.println("Kawasaki motorcycles deliver ultimate speed.");
    }
}
