package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit) { //true, если десятичное представление числа number содердит цифру digit
        boolean res = false;
        if (number==0 && digit==0) res = true;  // для 0
        else {
            if (number <0) number *= -1;   // для отрицательных
            for (; number > 0; number /= 10) {
                if ((number % 10) == digit) res = true;
            }
        }
        return res;
    }


    public static int fiboNumber(int n) {  // n-ое число Фибоначчи
        if (n==1) return 1;
        if (n==2) return 1;
        return fiboNumber(n-1) + fiboNumber(n-2);
    }


    public static boolean isGoldenTriangle(int a, int b, int c) {  // true, если треугольник со сторонами a, b, c является Золотым
        double aa = a;
        double bb = b;
        double cc = c;
        return  ((a==b) && (aa / cc > 1.61703) && (aa / cc < 1.61903)) || ((a==c) && (aa / bb > 1.61703) && (aa / bb < 1.61903)) || ((c==b) && (cc / aa > 1.61703) && (cc / aa < 1.61903));
    }


    public static void main(String[] args) {
        for (int n = 1; n <= 15; ++n) {
            System.out.println(fiboNumber(n));
        }
        int a = 1;
        while (a <= 100) {
            int b = 1;
            while (b <= 100) {
                int c = 1;
                while (c <= 100) {
                    if (isGoldenTriangle(a, b, c)) System.out.println(a + "   " + b + "   " + c);
                    ++c;
                }
                ++b;
            }
            ++a;
        }

    }
}
