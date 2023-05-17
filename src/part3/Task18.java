package part3;


public class Task18 {
    public static void main(String[] args) {
        int n = 255053000;

        String str = Integer.toString(n);
        StringBuilder builder = new StringBuilder(str);
        for (int i = str.length() - 3; i > 0; i -= 3) {
            builder.insert(i, ' ');
        }
        String num = builder.toString();
        System.out.println("Введено число: " + num);

    }
}

