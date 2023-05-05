package part5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {

    public static void searchNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст с шестнадцатиричными числами: ");
        String name = in.nextLine();

        Pattern pattern = Pattern.compile("\\b0?[xX]?[0-9a-fA-F]+\\b");
        Matcher matcher = pattern.matcher(name);
        int count = 0;
        while (matcher.find()) {
            ++count;
        }
        System.out.println("Количество шестнадцатиричных чисел в тексте: " + count);

    }
}