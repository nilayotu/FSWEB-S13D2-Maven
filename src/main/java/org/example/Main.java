package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static boolean isPalindrome(int a) {

        int absValue = Math.abs(a);
        String original = String.valueOf(absValue);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static boolean isPerfectNumber(int x){
        if (x < 0) {
            return false;
        }

        int sum = 0;

        for (int i=1; i<x; i++) {
            if (x % i ==0) {
                sum=sum+i;
            }
        }
        return sum == x;
    }

    public static String numberToWords(int p) {
        if (p < 0) {
            return "invalid Value";
        }


    }

}


