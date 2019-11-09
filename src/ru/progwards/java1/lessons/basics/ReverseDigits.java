package ru.progwards.java1.lessons.basics;

public class ReverseDigits {

    public static int reverseDigits(int number) {
        int hundreds = number / 100;
        int decades = (number - hundreds * 100) / 10;
        int ones = number - hundreds * 100 - decades * 10;
        return ones * 100 + decades * 10 + hundreds;
    }

    public static void main(String[] args) {
        final int NUMBER = 321;
        System.out.println(reverseDigits(NUMBER));
    }
}
