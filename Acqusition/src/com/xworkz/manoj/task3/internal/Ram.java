package com.xworkz.manoj.task3.internal;

public class Ram {
    private  String modelName;
    private int batteryCapacity;

    public  Ram(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Ram(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void towingCapacity() {
        System.out.println("RAM trucks are known for towing power.");
    }

}
