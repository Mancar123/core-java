package com.xworkz.manojtask1.internal;

public class Tankrunner {
    public void tank2() {
        System.out.println("Tank Details");
        Tank tank = new Tank();
        tank.setType("Battle Tank");
        tank.setCapacity(4);
        tank.setOperator("Manoj");
        tank.setArmored(true);
        tank.setWeight(55.0);
        tank.getType();
        tank.getCapacity();
        tank.getOperator();
        tank.getArmored();
        tank.getWeight();
    }

}
