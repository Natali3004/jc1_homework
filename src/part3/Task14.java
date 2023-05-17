package part3;

import java.math.BigInteger;

public class Task14 {
    public static void main(String[] args) {
        long x = 1;
        long y = 1;
        do {
            x++;
            y *= x;
        } while (x < 25);
        {
            System.out.println("Произведение чисел от 1 до 25 = " + y);
        }
    }
}