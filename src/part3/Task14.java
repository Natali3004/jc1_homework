package part3;

import java.math.BigInteger;

public class Task14 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        do {
            x++;
            y = y * x;
        } while (x < 25);
        {
            System.out.println("Произведение чисел от 1 до 25 = " + y);
        }
    }
}
