package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius) {  // объём шара с радиусом radius и основана на типе double
        return radius * radius * radius * 3.14 * 4.0 / 3.0;
    }

    public static float volumeBallFloat(float radius) {// которая будет возвращать объём шара с радиусом radius и основана на типе float
        return radius * radius * radius * 3.14f * 4.0f / 3.0f;
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallFloat((float) radius) - volumeBallDouble(radius);
    }

    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat(6371.2f));
        System.out.println(calculateAccuracy(6371.2));
    }


}
