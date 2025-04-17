package com.xworkz.manoj.task3.internal;

public class DodgeViper {
    private  String modelName;
    private int batteryCapacity;

    public  DodgeViper(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public DodgeViper(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void rawPower() {
        System.out.println("Dodge Viper delivers raw American muscle.");
    }
}
