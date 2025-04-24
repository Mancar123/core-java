package com.manoj.task6.external;

import com.manoj.task6.Car;

public class Engine {
    private Car car;
    public Engine(Car car){
        System.out.println("running car in engine");
        this.car=car;
    }
    public void getinfo(){
        if(car!=null){
            car.Gear();
        }
        else{
            System.out.println("car is null");
        }

    }
    }


