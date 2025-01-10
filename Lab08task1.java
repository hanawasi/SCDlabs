package lab08task1 ;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lab08task1 {
    public static void main(String[] args) {
        // Create three locks
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();
        Lock lock3 = new ReentrantLock();

        // Create three threads
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding Lock 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired Lock 2!");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding Lock 2...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (lock3) {
                    System.out.println("Thread 2: Acquired Lock 3!");
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (lock3) {
                System.out.println("Thread 3: Holding Lock 3...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (lock1) {
                    System.out.println("Thread 3: Acquired Lock 1!");
                }
            }
        });

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
