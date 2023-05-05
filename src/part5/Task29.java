package part5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        String str = " !!! Часть регулярного выражения - можно выделить в группу, для этого его следует взять в () круглые скобки.";
        Pattern pattern = Pattern.compile("([a-zа-я])\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
            System.out.print(matcher.group(1));

    }
}