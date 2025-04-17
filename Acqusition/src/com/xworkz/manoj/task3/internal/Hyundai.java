package com.xworkz.manoj.task3.internal;

public class Hyundai {
    private  String modelName;
    private int batteryCapacity;

    public  Hyundai(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Hyundai(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void efficiency() {
        System.out.println("Hyundai cars offer great fuel efficiency.");
    }

}
