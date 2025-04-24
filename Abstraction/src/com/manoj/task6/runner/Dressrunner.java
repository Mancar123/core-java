package com.manoj.task6.runner;

import com.manoj.task6.Dress;
import com.manoj.task6.external.Material;
import com.manoj.task6.external.Zarabrand;

public class Dressrunner {
    public static void main(String[] args) {
        Dress dress=new Material();
        Zarabrand zarabrand=new Zarabrand(dress);
        zarabrand.dressinfo();

    }
}
