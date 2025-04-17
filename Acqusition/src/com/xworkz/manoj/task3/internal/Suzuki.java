package com.xworkz.manoj.task3.internal;

public class Suzuki {
    private  String modelName;
    private int batteryCapacity;

    public  Suzuki(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Suzuki(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void compactEfficiency() {
        System.out.println("Suzuki cars are compact yet efficient.");
    }

}
