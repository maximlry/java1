public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit) { //true, если десятичное представление числа number содердит цифру digit

        boolean cd = false;

        // определяем порядок числа
        int num = number;
        int countOfNumbers = 0;
        for ( ; num != 0 ; num /= 10)
            ++countOfNumbers;
        System.out.println("Длина числа " + countOfNumbers + " симв. ");

        // макс порядок dec
        int i=1;
        int dec = 1;
        do {
            dec *= 10;
            i += 1;
            System.out.println(dec);
        }
        while (i < countOfNumbers);

        // проверка присутствия цыфры
        for (int d = 1; d <= countOfNumbers; d += 1) {
            System.out.println("остаток от деления на " + d + " - " + number % d);
            if (number % 10 == digit) cd = true;
            else {
                number /= 10;
                System.out.println("Новое значние number " + number);
            }
        }

        return cd;
    }

    public static void main(String[] args) {
        containsDigit(592, 1);
    }
}
