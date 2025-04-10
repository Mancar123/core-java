package com.xworkz.manojtask1.internal;

public class Occupationrunner {

        public void occupation2 () {
            System.out.println("Career details:");
            Occupation occupation = new Occupation();
            occupation.setJobTitle("Software Engineer");
            occupation.setCompany("Tech Corp");
            occupation.setSalary(75000.0);
            occupation.setExperienceYears(5);
            occupation.setRemote(true);
            occupation.getJobTitle();
            occupation.getCompany();
            occupation.getSalary();
            occupation.getExperienceYears();
            occupation.getRemote();
        }
    }


