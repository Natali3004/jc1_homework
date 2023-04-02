package part3;

public class Task18 {
    public static void main(String[] args) {
        int n = 20023143;
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100 % 10;
        int d = n / 1000 % 10;
        int e = n / 10000 % 10;
        int f = n / 100000 % 10;
        int j = n / 1000000 % 10;
        int k = n / 10000000 % 10;
        System.out.println("Введено число: " + n);

        System.out.println("В бухгалтерсокм формате: " + k + j + " " + f + e + d + " " + c + b + a);

    }
}
