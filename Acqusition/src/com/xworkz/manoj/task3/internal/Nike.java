package com.xworkz.manoj.task3.internal;

public class Nike {
    private  String modelName;
    private int outlets;

    public  Nike(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", OUTLETS: " + outlets;
    }


    public Nike(String modelName, int outlets) {
        this.modelName = modelName;
        this.outlets = outlets;
    }
        public void comfort() {
            System.out.println("Nike blends style with athletic comfort.");
        }

}
