package com.xworkz.manoj.task3.internal;

public class Uniqlo {
    private  String modelName;
    private int outlets;

    public  Uniqlo(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", OUTLETS: " + outlets;
    }


    public Uniqlo(String modelName, int outlets) {
        this.modelName = modelName;
        this.outlets = outlets;

    }
    public void simplicity() {
        System.out.println("Uniqlo promotes minimalist, functional designs.");
    }
}
