package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {
    public static void searchTegs() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст : ");
        String name = in.nextLine();

        Pattern pattern = Pattern.compile("<[^<>]+>");
        Matcher matcher = pattern.matcher(name);
        int count = 0;
        while (matcher.find()) {
            ++count;
        }
            System.out.println("Найдено " + count + " тегa(ов) абзацев");

        String replace = matcher.replaceAll("<p>");

        System.out.println("Замена всех тегов абзацев в предложении на <p>: " + replace);

    }
}