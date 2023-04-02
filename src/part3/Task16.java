package part3;

public class Task16 {
    public static void main(String[] args) {
        boolean second = false;
        for (int i = 50; i <= 70; i++) {
            boolean first = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    first = false;
                    break;
                }
            }
            if (first) {
                if (second) {
                    System.out.println("Второе простое число в промежутке от 50 до 70 : " + i);
                    break;
                }
                second = true;
            }
        }
    }
}