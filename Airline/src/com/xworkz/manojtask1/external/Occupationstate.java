package com.xworkz.manojtask1.external;

import com.xworkz.manojtask1.internal.Occupation;

public class Occupationstate {
        public static void jobDetails() {
            System.out.println("Occupation details:");
            Occupation worker = new Occupation();
            worker.getJobTitle();
            worker.getCompany();
            worker.getSalary();
            worker.getExperienceYears();
            worker.getRemote();
        }
    }


