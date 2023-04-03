package part3;

public class Task22 {
    public static void main(String[] args) {
        int[] myMasiv = {5, 0, 3, 6, 9, 7, 16, 15, 8, 1};
        int max = myMasiv[0];
        int min = myMasiv[0];
        int test = 0;
        int test2 = 0;
        int sum = 0;
        for (int i = 0; i < myMasiv.length; i++) {
            if (myMasiv[i] > max) {
                max = myMasiv[i];
                test = i;
            }
            if (myMasiv[i] < min) {
                min = myMasiv[i];
                test2 = i;
            }
        }
        System.out.println("Максимальный элемент массива индекс " + test + " значение " + max);
        System.out.println("Минимальный элемент массива: " + test2 + " значение " + min);

        if (test2 < test) {
            for (int i = test2 + 1; i < test; i++)
                sum += myMasiv[i];
        } else if (test2 > test) {
            for (int i = test + 1; i < test2; i++)
                sum += myMasiv[i];
        }
        System.out.println("Сумма элементов массива между минимальным и максимальным значениями: " + sum);
    }
}






