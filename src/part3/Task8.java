package part3;

public class Task8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int r = 1;
        if (Math.sqrt(a*a + b*b)/2 <= r) {
            System.out.println("Круг закроет прямоугольник");
        } else {
            System.out.println("Площади круга недостаточно для закрытия прямоугольника");
        }
    }
}
