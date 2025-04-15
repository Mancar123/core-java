package com.xworkz.manoj.task3.internal;

public class morning {
        public static void main(String[] args) {
            String city = "gadag";
            char[] characters = city.toCharArray();
            boolean[] counted = new boolean[characters.length];

            for (int i = 0; i < characters.length; i++) {
                if (!counted[i]) {
                    int count = 1;

                    for (int j = i + 1; j < characters.length; j++) {
                        if (characters[i] == characters[j]) {
                            count++;
                            counted[j] = true;
                        }
                    }

                    System.out.println(characters[i] + "  " + count);
                }
            }
        }
    }
