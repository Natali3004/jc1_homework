package part7;

import java.util.ArrayList;


public class Task40 {
    public static void main(String[] args) {
        int value = 20;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            int mark = 1 + (int) (Math.random() * 10);
            list.add(mark);
        }
        System.out.println("All class marks: " + list);

        ArrayList<Integer> listMin = new ArrayList<>();
        int min = 3;
        for (int i = 0; i < value; i++) {
            int num = list.get(i);
            if (num <= min) {
                listMin.add(num);
            }
        }
        list.removeAll(listMin);
        System.out.println("Only positive marks: " + list);
    }
}