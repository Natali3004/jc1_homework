package part9;

import java.io.*;
import java.util.Random;

public class Task55 extends Thread {

    private final String threadNumber;


    public Task55(String threadNumber) {
        this.threadNumber = threadNumber;
    }

    public static void main(String[] args) throws IOException {

        for (int num = 1; num <= 5; num++) {
            new Task55("Thread  " + num).run();
          }
    }

    public void run() {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt();

            try (OutputStream os = new FileOutputStream(threadNumber)) {
                for (int k : array) os.write(String.valueOf(k).getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        System.out.println(threadNumber + "  is  created.");
    }
}
