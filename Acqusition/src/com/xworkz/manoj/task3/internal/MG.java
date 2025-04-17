package com.xworkz.manoj.task3.internal;

public class MG {
    private  String modelName;
    private int batteryCapacity;

    public  MG(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public MG(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void heritageDesign() {
        System.out.println("MG combines classic British design with modern technology.");
    }
}
