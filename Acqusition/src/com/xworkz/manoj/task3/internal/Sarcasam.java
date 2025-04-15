package com.xworkz.manoj.task3.internal;

public class Sarcasam {
        public static void main(String[] args) {
            String Ipl = "Rcb cooked csk without cooker";
            int count = 0;

            for (char man : Ipl.toCharArray()) {
                if ( man!= 0) {
                    count++;
                }
            }
            System.out.println("Total number of characters present are : " + count);
        }
    }


