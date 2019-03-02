package pl.sda._JAVA_gda24_intro.concurrent;

public class SimpleCustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("SimpleCustomThread!");
    }

    public static void main(String[] args) {
        SimpleCustomThread thread = new SimpleCustomThread();
        thread.start();
    }
}
