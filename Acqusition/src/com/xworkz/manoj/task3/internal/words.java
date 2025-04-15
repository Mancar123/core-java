package com.xworkz.manoj.task3.internal;

public class words {
        public static void main(String[] args) {
            String manoj = "dulquer salman is fond of cars";
            String[] words = manoj.split("\\s+");
            System.out.println("Number of words: " + words.length);
        }
    }

