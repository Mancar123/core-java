package com.xworkz.manoj.task3.internal;

public class HispanoSuiza {
    private  String modelName;
    private int batteryCapacity;

    public  HispanoSuiza(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public HispanoSuiza(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void artisticCraftsmanship() {
        System.out.println("Hispano Suiza blends luxury with classic design.");
    }
}
