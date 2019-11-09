package ru.progwards.java1.lessons.basics;

public class Astronomy {

    public static final double PI = 3.14;

    public static Double sphereSquare(Double r) { //вычисляет площадь поверхности сферы радиуса R
        return 4 * PI * r * r;
    }

    public static Double earthSquare() { // вычисляет площадь поверхности Земли, считая радиус равным 6 371.2 км
        return sphereSquare(6371.2);
    }

    public static Double mercurySquare() { // вычисляет площадь поверхности Меркурия, считая радиус равным 2 439,7
        return sphereSquare(2439.7);
    }

    public static Double jupiterSquare() {  // вычисляет площадь поверхности Юпитера, считая радиус равным 71 492 км
        return sphereSquare(71492.0);
    }

    public static Double earthVsMercury() { // вычисляет отношение площади поверхности Земли к площади поверхности Меркурия
        return earthSquare() / mercurySquare();
    }

    public static Double earthVsJupiter() { // вычисляет отношение площади поверхности Земли к площади поверхности Юпитера
        return earthSquare() / jupiterSquare();
    }

    public static void main(String[] args) {
        System.out.println("Oтношение площади поверхности Земли к площади поверхности Меркурия:");
        System.out.println(earthVsMercury());
        System.out.println("Oтношение площади поверхности Земли к площади поверхности Юпитера:");
        System.out.println(earthVsJupiter());
    }
}
