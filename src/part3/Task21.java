package part3;

public class Task21 {
    public static void main(String[] args) {
        int[] myMasiv = {5, 2, 3, 6, 9, 7, 12, 15, 0, 1};
        int max = myMasiv[0];
        int test = 0;
        for (int i = 1; i < myMasiv.length; i++) {
            if (myMasiv[i] > max) {
                max = myMasiv[i];
                test = i;
            }
        }
        System.out.print("Максимальный элемент в массиве myMasiv, индекс " + test + " значение " + max);
    }
}
