package part3;

public class Task20 {
    public static void main(String[] args) {
        int[] myMasiv = new int[10];
        myMasiv[0] = 5;
        myMasiv[1] = 7;
        myMasiv[2] = 14;
        myMasiv[3] = 10;
        myMasiv[4] = 1;
        myMasiv[5] = 12;
        myMasiv[6] = 7;
        myMasiv[7] = 4;
        myMasiv[8] = 8;
        myMasiv[9] = 3;
            for (int i = 1; i < myMasiv.length; i++) {
            if (i % 2 == 0) {
                System.out.println(" Четный индекс  " + i + " = " + myMasiv[i]);
            }
        }
    }
}
