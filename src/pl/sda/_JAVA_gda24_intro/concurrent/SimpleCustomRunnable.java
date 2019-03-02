package pl.sda._JAVA_gda24_intro.concurrent;

public class SimpleCustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("SimpleCustomRunnable!");
    }

    public static void main(String[] args) {
        SimpleCustomRunnable runnable = new SimpleCustomRunnable();

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
