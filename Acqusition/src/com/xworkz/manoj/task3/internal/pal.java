package com.xworkz.manoj.task3.internal;

public class pal {
        public static void main(String[] args) {
            String str = "gadag";

            int length = 0;
            for (char c : str.toCharArray()) {
                length++;
            }
            boolean isPalindrome = true;
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println(str + " yes it is a palindrome");
            } else {
                System.out.println(str + " no it is not a palindrome");
            }
        }
    }
