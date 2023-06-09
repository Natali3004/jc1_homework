package part9;

public class Task56 extends Thread {
    ThreadNumber d;
    int num;

    Task56(ThreadNumber d, int num) {
        this.d = d;
        this.num = num;
    }

    public void run() {
        d.printThread(num);
    }

    public static class ThreadNumber {
        public synchronized void printThread(int threadNumber) {
            System.out.println("Thread number is " + threadNumber);
        }
    }

    public static void main(String[] args) {
        ThreadNumber d = new ThreadNumber();
        Thread[] myThreads = new Thread[11];
        for (int i = 1; i <= 10; i++) {
            myThreads[i] = new Task56(d, i);
            myThreads[i].start();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
