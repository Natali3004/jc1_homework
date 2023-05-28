package part8;

import java.io.*;
import java.util.Random;

public class Task51 {
    public static void main(String[] args) throws IOException {

        File directory = new File("D:\\1\\2\\3");
        directory.mkdirs();

        FileOutputStream oneDoc, oneDoc2, oneDoc3, oneDoc4, oneDoc5;
        try {
            oneDoc = new FileOutputStream("D:\\1\\2\\3\\one.txt" );
            oneDoc2 = new FileOutputStream("D:\\1\\2\\3\\two.txt" );
            oneDoc3 = new FileOutputStream("D:\\1\\2\\3\\three.txt" );
            oneDoc4 = new FileOutputStream("D:\\1\\2\\3\\four.txt" );
            oneDoc5 = new FileOutputStream("D:\\1\\2\\3\\five.txt" );

            Random random = new Random();

            int[] array = new int[20];
            for (int i = 0; i < array.length; ++i) array[i] = random.nextInt();

            int[] array2 = new int[20];
            for (int i = 0; i < array.length; ++i) array2[i] = random.nextInt();

            int[] array3 = new int[20];
            for (int i = 0; i < array.length; ++i) array3[i] = random.nextInt();

            int[] array4 = new int[20];
            for (int i = 0; i < array.length; ++i) array4[i] = random.nextInt();

            int[] array5 = new int[20];
            for (int i = 0; i < array.length; ++i) array5[i] = random.nextInt();

            for (int j : array) oneDoc.write(String.valueOf(j).getBytes());
            for (int j : array2) oneDoc2.write(String.valueOf(j).getBytes());
            for (int j : array3) oneDoc3.write(String.valueOf(j).getBytes());
            for (int j : array4) oneDoc4.write(String.valueOf(j).getBytes());
            for (int j : array5) oneDoc5.write(String.valueOf(j).getBytes());
            oneDoc.close();
            oneDoc2.close();
            oneDoc3.close();
            oneDoc4.close();
            oneDoc5.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}