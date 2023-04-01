package part3;

public class Task13 {
    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        int result = 1;
        while (x <= y) {
            result = result * x;
            System.out.println("Факториал " + x + "  равен = " + result);
            x++;
        }
    }
}
