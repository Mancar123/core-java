package com.xworkz.manoj.task3.internal;

public class Mini {
    private  String modelName;
    private int batteryCapacity;

    public  Mini(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Mini(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void agility() {
        System.out.println("Mini cars are known for their small but powerful design.");
    }

}
