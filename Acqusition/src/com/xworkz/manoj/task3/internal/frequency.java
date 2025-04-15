package com.xworkz.manoj.task3.internal;

public class frequency {
        public static void main(String[] args) {
            String Ipl = "rcb pkbs rcb srh rcb srh";
            String[] words = Ipl.split(" ");
            String[] uniqueWords = new String[words.length];
            int[] counts = new int[words.length];
            int count = 0;

            for (String word : words) {
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (uniqueWords[i].equals(word)) {
                        counts[i]++;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    uniqueWords[count] = word;
                    counts[count] = 1;
                    count++;
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.println(uniqueWords[i] + "  " + counts[i]);
            }
        }
    }

