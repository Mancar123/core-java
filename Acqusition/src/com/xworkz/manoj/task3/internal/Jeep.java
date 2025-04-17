package com.xworkz.manoj.task3.internal;

public class Jeep {
    private  String modelName;
    private int batteryCapacity;

    public  Jeep(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Jeep(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void offRoad() {
        System.out.println("Jeep excels in off-road environments.");
    }

}
