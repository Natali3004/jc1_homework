package part3;

public class Task23 {
    public static void main(String[] args) {
        int[] myMasiv = {5, 0, 3, 6, 9, 7, 12, 15, 8, 1};
        System.out.println("Первоначальный массив: " + myMasiv[0] + ", " + myMasiv[1] + ", " + myMasiv[2] + ", "
                + myMasiv[3] + ", " + myMasiv[4] + ", " + myMasiv[5] + ", " + myMasiv[6] + ", " + myMasiv[7] + ", " + myMasiv[8] +
                ", " + myMasiv[9]);

        for (int i = 0; i < myMasiv.length / 2; i++) {
            int temp = myMasiv[i];
            myMasiv[i] = myMasiv[myMasiv.length - i - 1];
            myMasiv[myMasiv.length - i - 1] = temp;
        }
        System.out.println("Перевернутый массив: " + myMasiv[0] + ", " + myMasiv[1] + ", " + myMasiv[2] + ", "
                + myMasiv[3] + ", " + myMasiv[4] + ", " + myMasiv[5] + ", " + myMasiv[6] + ", " + myMasiv[7] + ", " + myMasiv[8] +
                ", " + myMasiv[9]);

    }
}

