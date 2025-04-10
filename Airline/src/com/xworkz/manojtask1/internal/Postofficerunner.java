package com.xworkz.manojtask1.internal;

public class Postofficerunner {
    public static void Postoffice2() {
        System.out.println("Post Office Details");

        Postoffice postOffice = new Postoffice();
        postOffice.setLocation("Bengaluru");
        postOffice.setOfficeCode(560001);
        postOffice.setPostmaster("Ravi");
        postOffice.setOperational(true);
        postOffice.setAreaSize(250.5);

        postOffice.getLocation();
        postOffice.getOfficeCode();
        postOffice.getPostmaster();
        postOffice.getOperational();
        postOffice.getAreaSize();
    }

}
