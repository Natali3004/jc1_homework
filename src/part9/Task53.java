package part9;

import java.util.Random;

public class Task53 extends Thread {
    private int threadNumber;

    public Task53(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {

        int[] array2 = new int[10];
        Random random = new Random();
        for (int i = 0; i < array2.length; i++)
            array2[i] = random.nextInt();

            int sum = 0;
            for (int j = 0; j < array2.length; j++) {
                sum += array2[j];
            }
            int average;
            average = sum / array2.length;

            System.out.println("Thread  is " + threadNumber + " - average is " + average);
        }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Task53 myThreads = new Task53(i);
            myThreads.run();
        }
    }
}