package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {

    public static boolean isTriangle(int a, int b, int c) { // длина каждой из сторон меньше суммы длин двух других сторон
        if((a < b + c) && (b < a + c) && (c < b + a)) return true;
        else return false;
    }

    public static boolean isRightTriangle(int a, int b, int c) { // является прямоугольным. Для int?????
        if ((a * a == b * b + c * c)||(b * b == a * a + c * c)||(c * c == b * b + a * a)) return true;
        else return false;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {  // является равнобедренным
        if ((a==b) || (a==c) || (b==c)) return true;
        else return false;
    }


}
