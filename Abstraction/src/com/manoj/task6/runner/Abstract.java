package com.manoj.task6.runner;

import com.manoj.task6.Jdbc;
import com.manoj.task6.external.IplApp;
import com.manoj.task6.external.Mysqljdbc;

public class Abstract {
    public static void main(String[] args) {
        Jdbc jdbc=new Mysqljdbc();

        IplApp iplApp=new IplApp(jdbc);
        iplApp.saveinfo();

    }
}
