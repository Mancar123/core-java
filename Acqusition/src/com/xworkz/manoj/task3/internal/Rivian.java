package com.xworkz.manoj.task3.internal;

public class Rivian {

    private  String modelName;
    private int batteryCapacity;

    public  Rivian(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Rivian(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void electricDrive() {
        System.out.println("Rivian designs premium electric trucks.");
    }

}
