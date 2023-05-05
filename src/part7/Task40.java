package part7;

import java.util.ArrayList;
import java.util.Iterator;

public class Task40 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int value = 20;
        int min = 3;
        for (int i = 0; i < value; i++) {
            int mark = 1 + (int) (Math.random() * 10);
            list.add(mark);
        }
        System.out.println("All class marks: " + list);


        for (Iterator<Integer> iterator = list.iterator();
             iterator.hasNext(); )
            if (iterator.next() <= min) {
                iterator.remove();
            }
        System.out.println("Only positive marks: " + list);
    }
}