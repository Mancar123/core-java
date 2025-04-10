package com.xworkz.manojtask1.external;

import com.xworkz.manojtask1.internal.Postoffice;

public class Postofficestate {
    public static void Post2() {
    }

    public void postOffice() {
    System.out.println("Post Office Details");
    Postoffice offices = new Postoffice();
    offices.getLocation();
    offices.getOfficeCode();
    offices.getPostmaster();
    offices.getOperational();
    offices.getAreaSize();
}


}
