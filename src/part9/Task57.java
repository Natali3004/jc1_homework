package part9;

public class Task57  {

    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Thread t1 = new Thread(new Deadlock(obj1, obj2), "Thread1");
        Thread t2 = new Thread(new Deadlock(obj2, obj3), "Thread2");
        Thread t3 = new Thread(new Deadlock(obj3, obj1), "Thread3");

        t1.start();
        Thread.sleep(2000);
        t2.start();
        Thread.sleep(2000);
        t3.start();
    }
}

class Deadlock implements Runnable {
    private final Object lock1;
    private final Object lock2;

    public Deadlock(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (lock1) {
            System.out.println(name + " заблокирован " + lock1);
            work();
        }
        synchronized (lock2) {
            System.out.println(name + " заблокирован " + lock2);
            work();
        }
    }

    private void work() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

