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

        for (int i=1; i <= x / 2; i++) {
            if (x % i ==0) {
                sum=sum+i;
            }
        }
        return sum == x;
    }

    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value";

        String numToText = "";
        char[] digits = String.valueOf(number).toCharArray();
        for (char digit : digits){
            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }
        }
        return numToText.trim();
    }

}


