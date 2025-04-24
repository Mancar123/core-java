package com.manoj.task6.external;

import com.manoj.task6.Jdbc;

public class Mysqljdbc implements Jdbc {
    @Override
    public void save() {
        System.out.println("running in mysql");

    }
}
