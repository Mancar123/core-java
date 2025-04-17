package com.xworkz.manoj.task3.internal;

public class FabIndia {
    private  String modelName;
    private int outlets;

    public  FabIndia(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", OUTLETS: " + outlets;
    }


    public FabIndia(String modelName, int outlets) {
        this.modelName = modelName;
        this.outlets = outlets;

    }
    public void tradition() {
        System.out.println("FabIndia brings Indian tradition to everyday wear.");
    }

}
