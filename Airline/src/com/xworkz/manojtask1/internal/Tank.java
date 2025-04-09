package com.xworkz.manojtask1.internal;

public class Tank {
    private String type = "Battle Tank";
    private int capacity = 4;
    private String operator = "Manoj";
    private boolean isArmored = true;
    private double weight = 55.0;

    void setType(String type) {
        this.type = type;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setOperator(String operator) {
        this.operator = operator;
    }

    void setArmored(boolean isArmored) {
        this.isArmored = isArmored;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    public void getType() {
        System.out.println(type);
    }

    public void getCapacity() {
        System.out.println(capacity);
    }

    public void getOperator() {
        System.out.println(operator);
    }

    public void getArmored() {
        System.out.println(isArmored);
    }

    public void getWeight() {
        System.out.println(weight);
    }
}
