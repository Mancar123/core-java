package com.xworkz.manoj.task3.internal;

public class Paul {
        public static void main(String[] args) {
            String Ipl = "Rcb cooked Mumbai indians without washing machine";
            StringBuilder modifiedSentence = new StringBuilder();

            for (char rep : Ipl.toCharArray()) {
                if (rep == ' ') {
                    modifiedSentence.append('%');
                } else {
                    modifiedSentence.append(rep);
                }
            }

            System.out.println("replaced sentence is: " + modifiedSentence.toString());
        }
    }
    
