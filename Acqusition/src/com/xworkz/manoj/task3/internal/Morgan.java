package com.xworkz.manoj.task3.internal;

public class Morgan {

    private  String modelName;
    private int batteryCapacity;

    public  Morgan(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Morgan(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void vintageCharm() {
        System.out.println("Morgan vehicles retain vintage design charm.");
    }

    public void handcraftedWoodDash() {

    }
}
