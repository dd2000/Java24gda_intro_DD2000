package pl.sda._JAVA_gda24_intro.concurrent;

public class CustomThread extends Thread {
    public CustomThread() {}

    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
