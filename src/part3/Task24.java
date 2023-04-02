package part3;

public class Task24 {
    public static void main(String[] args) {
        int[][] myMasiv = new int[5][5];
        myMasiv[0][0] = 1;
        myMasiv[0][1] = 1;
        myMasiv[0][2] = 1;
        myMasiv[0][3] = 1;
        myMasiv[0][4] = 1;
        myMasiv[1][0] = 0;
        myMasiv[1][1] = 1;
        myMasiv[1][2] = 1;
        myMasiv[1][3] = 1;
        myMasiv[1][4] = 0;
        myMasiv[2][0] = 0;
        myMasiv[2][1] = 0;
        myMasiv[2][2] = 1;
        myMasiv[2][3] = 0;
        myMasiv[2][4] = 0;
        myMasiv[3][0] = 0;
        myMasiv[3][1] = 1;
        myMasiv[3][2] = 1;
        myMasiv[3][3] = 1;
        myMasiv[3][4] = 0;
        myMasiv[4][0] = 1;
        myMasiv[4][1] = 1;
        myMasiv[4][2] = 1;
        myMasiv[4][3] = 1;
        myMasiv[4][4] = 1;

        for (int i = 0; i < myMasiv.length; i++) {
            for (int j = 0; j < myMasiv[i].length; j++) {
                System.out.print(myMasiv[i][j] + "\t");
            }
            System.out.println();
        }
    }
}