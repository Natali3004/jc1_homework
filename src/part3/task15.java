package part3;

public class task15 {
    public static void main(String[] args) {
        long n = 7893823445L;
        int sum = 0;
        do {
            sum += (n % 10);
            n /= 10;
        }
        while (n != 0);
        {
            System.out.println("Сумма элементов числа 7893823445 равна = " + sum);
        }
    }
}
