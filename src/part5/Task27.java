package part5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        String str = " !!! Часть регулярного выражения - можно выделить в группу, для этого его следует взять в () круглые скобки.";
        Pattern pattern = Pattern.compile("[\\p{P}]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;

        while (matcher.find()) {
            ++count;
        }
        System.out.println("Количество знаков препинания: " + count);
    }
}

