package com.manoj.task6.runner;

import com.manoj.task6.Car;
import com.manoj.task6.external.Engine;
import com.manoj.task6.external.IplApp;
import com.manoj.task6.external.performance;

public class Carrunner {
    public static void main(String[] args) {
        Car car=new performance();
        Engine engine=new Engine(car);
        engine.getinfo();



    }
}
