package Multithreading;

public class thread_schedular extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        thread_schedular t1 = new thread_schedular();
        thread_schedular t2 = new thread_schedular();
        thread_schedular t3 = new thread_schedular();
        thread_schedular t4 = new thread_schedular();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // t1.start(); IllegalThreadStateException
    }
}
