package com.xworkz.manoj.task3.internal;

public class Levis {
    private  String modelName;
    private int outlets;

    public  Levis(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", OUTLETS: " + outlets;
    }


    public Levis(String modelName, int outlets) {
        this.modelName = modelName;
        this.outlets = outlets;
    }
        public void durability() {
        System.out.println("Levi’s jeans are built to last.");
    }

    public void customFit() {

    }
}
