package ru.progwards.maximlry;

public class HelloWorld {
    static void println(String str) {
        System.out.println(str);
    }

    static int addition(int x, int y) {
        return x + y;
    }

    static int addition1(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        println("Эй!");
        println("Привет!!!");
        System.out.print("Я знаю что 7 + 5 = ");
        System.out.println(addition(5,7));

    }
}
