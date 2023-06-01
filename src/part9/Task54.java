package part9;

import java.util.Random;

public class Task54 extends Thread{

    private int threadNumber;

    public Task54(int threadNumber) {
        this.threadNumber = threadNumber;
          }
    public void run() {

        int[] array2 = new int[10];
        Random random = new Random();
        for (int i = 0; i < array2.length; i++)
            array2[i] = random.nextInt();

        int max = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
        }
            System.out.println("Thread  is " + threadNumber + " - MAX is " + max);
        }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Task54 myThreads = new Task54(i);
            myThreads.run();
        }
    }
}
