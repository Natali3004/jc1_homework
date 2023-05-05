package part7;

import java.util.ArrayList;
import java.util.Iterator;

public class Task40 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int mark = 1 + (int) (Math.random() * 10);
            list.add(mark);
        }
        System.out.println("All class marks: " + list);

        ArrayList<Integer> listMin = new ArrayList<>();
        int min = 3;
        for (int i = 0; i < 20; i++) {
            int num = list.get(i);
            if (num <= min) {
                listMin.add(num);
            }
        }
        list.removeAll(listMin);
        System.out.println("Only positive marks: " + list);
    }
}