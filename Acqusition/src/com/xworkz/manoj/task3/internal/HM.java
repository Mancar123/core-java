package com.xworkz.manoj.task3.internal;

public class HM {
    private  String modelName;
    private int outlets;

    public HM(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", OUTLETS: " + outlets;
    }


    public HM(String modelName, int outlets) {
        this.modelName = modelName;
        this.outlets = outlets;
    }
        public void affordability() {
            System.out.println("H&M provides trendy clothing at affordable prices.");
        }
    }

