package pl.sda._JAVA_gda24_intro.concurrent;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
