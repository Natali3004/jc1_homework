package part3;

public class Task23 {
    public static void main(String[] args) {
        int[] myMasiv = {5, 0, 3, 6, 9, 7, 12, 15, 8, 1};
        System.out.print("Первоначальный массив: ");
        for (int i = 0; i < myMasiv.length; i++) {
            System.out.print(myMasiv[i] + " , ");
        }

        for (int i = 0; i < myMasiv.length / 2; i++) {
            int temp = myMasiv[i];
            myMasiv[i] = myMasiv[myMasiv.length - i - 1];
            myMasiv[myMasiv.length - i - 1] = temp;
        }
        System.out.print("\nПеревернутый массив: ");
        for (int i = 0; i < myMasiv.length; i++) {
            System.out.print(myMasiv[i] + " , ");

        }
    }
}
