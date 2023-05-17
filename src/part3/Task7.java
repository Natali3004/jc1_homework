package part3;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(method(275));
    }

    public static boolean method(int i) {
        if (i % 10 == 7)
            return true;
         else {
            return false;
        }
    }
}