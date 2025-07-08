
public class Main {
    public static void main(String[] args) {
        // task 1
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // task 2
        for (byte a = 10; a >= 1; a--) {
            System.out.println(a);
        }
        // task 3
        for (byte b = 2; b <= 17; b += 2) {
            System.out.println(b);
        }
        // task 4
        for (byte c = 10; c >= -10; c--) {
            System.out.println(c);
        }
        // task 5
        for (short year = 1904; year < 2097; year += 4) {
            System.out.println(year + " год является високосным.");
        }
        // task 6
        for (byte eachSeven = 7; eachSeven < 100; eachSeven += 7) {
            System.out.println(eachSeven);
        }
        // task 7
        for (short onTwo = 1; onTwo < 520; onTwo *= 2) {
            System.out.println(onTwo);
        }
        // task 8
        int investment = 0;
        for (byte month = 1; month <= 12; month++) {
            investment += 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + investment + " рублей.");
        }
        // task 9
        int savings = 0;
        int investment2 = 29000;
        for (byte month = 1; month <= 12; month++) {
            savings = savings + savings / 100 * 12 / 12;
            savings = savings + investment2;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей.");
        }
        // task 10
        int sum;
        for (byte i = 1; i <= 10; i++) {
            sum = 2 * i;
            System.out.println("2*" + i + "=" + sum);
        }
    }
}