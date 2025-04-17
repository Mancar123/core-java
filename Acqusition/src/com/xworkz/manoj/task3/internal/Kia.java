package com.xworkz.manoj.task3.internal;

public class Kia {
    private  String modelName;
    private int batteryCapacity;

    public  Kia(){}

    public String toString() {
        System.out.println("running toString in class");
        return " Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Kia(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void smartTechnology() {
        System.out.println("Kia incorporates smart vehicle technology.");
    }
}
