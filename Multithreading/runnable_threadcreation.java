package Multithreading;

public class runnable_threadcreation implements Runnable {
    public void run() {
        System.out.println("Runnable thread running");
    }

    public static void main(String[] args) {
    	runnable_threadcreation ref = new runnable_threadcreation();
        Thread t = new Thread(ref);
        t.start();
    }
}