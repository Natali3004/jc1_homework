package part4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        int words = 0;
        int puncts = 0;
        Matcher m;

        String str = "    !!! Часть   регулярного выражения   - можно выделить в отдельную  группу," +
                " для этого   его следует взять в () круглые скобки.";
        Pattern punct = Pattern.compile("\\p{P}");
        String[] arrayText = str.split("\\s");
        for (String s : arrayText) {
            int count = 0;
            m =  punct.matcher(s);
            while (m.find()) {
                ++count;
            }
            puncts += count;
            if (count != s.length()) {
                ++words;
            }
        }
        System.out.println("Количество слов в предложении: " + words);


    }
}