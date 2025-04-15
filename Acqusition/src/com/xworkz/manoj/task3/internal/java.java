package com.xworkz.manoj.task3.internal;

public class java {
        public static void main(String[] args) {
            String Ipl = "Rcb cooked rajasthan without salt";
            int count = 0;

            for (char rcb : Ipl.toCharArray()) {
                if (Character.isWhitespace(rcb)) {
                    count++;
                }
            }
            System.out.println("Total number of spaces present are: " + count);
        }
    }

