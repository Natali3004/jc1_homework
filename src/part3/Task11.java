package part3;

public class Task11 {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        int c = 4;
        int d = 1;
        int e = 5;
        int f = 9;

        if (a <= 0 || b <= 0 || c <= 0 || d <= 0 || e <= 0 || f <= 0) {
            System.out.println("Ни одна из сторон не может быть меньше нуля");
        } else if (a + c <= e && b <= f && d <= f) {
            System.out.println("1. Оба дома можно разместить на указанной площади");
        } else if (a + d <= e && b <= f && c <= f) {
            System.out.println("2. Оба дома можно разместить на указанной площади");
        } else if (b + c <= e && a <= f && d <= f) {
            System.out.println("3. Оба дома можно разместить на указанной площади");
        } else if (b + d <= e && a <= f && c <= f) {
            System.out.println("4. Оба дома можно разместить на указанной площади");
        } else if (b + c <= f && a <= e && d <= e) {
            System.out.println("5. Оба дома можно разместить на указанной площади");
        } else if (a + c <= f && b <= e && d <= e) {
            System.out.println("6. Оба дома можно разместить на указанной площади");
        } else if (a + d <= f && b <= e && c <= e) {
            System.out.println("7. Оба дома можно разместить на указанной площади");
        } else if (b + d <= f && a <= e && c <= e) {
            System.out.println("8. Оба дома можно разместить на указанной площади");
        } else {
            System.out.println("Дома нельзя разместить на указанной площади");
        }
    }
}

