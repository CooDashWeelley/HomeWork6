
public class Main {
    public static void main(String[] args) {
        // task 1
        for (byte i = 1; i <= 10; i ++) {
            System.out.println(i);
        }
        // task 2
        for (byte a = 10; a >= 1; a --) {
            System.out.println(a);
        }
        // task 3
        for (byte b = 2; b <= 17; b += 2) {
            System.out.println(b);
        }
        // task 4
        for (byte c = 10; c >= -10; c --) {
            System.out.println(c);
        }
        // task 5
        for (short year = 1904; year < 2097; year += 4) {
            System.out.println(year + " год является високосным.");
        }
    }
}