package com.xworkz.manoj.task3.internal;

public class PremierAutomobiles {
    private  String modelName;
    private int batteryCapacity;

    public  PremierAutomobiles(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public PremierAutomobiles(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void IndianCarHistory() {
        System.out.println("Premier introduced early Indian cars.");
    }
}
