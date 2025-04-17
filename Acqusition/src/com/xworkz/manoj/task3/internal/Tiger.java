package com.xworkz.manoj.task3.internal;

public class Tiger {
    private  String Name;
    private int lifespan;

    public  Tiger(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Name: " +Name + ", lipespan : " + lifespan ;
    }


    public Tiger(String Name, int lifespan) {
        this.Name = Name;
        this.lifespan = lifespan;

    }
    public void cub() {
        System.out.println("Tiger class method");
    }
}


