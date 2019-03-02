package pl.sda._JAVA_gda24_intro.concurrent;

public class MyRunnable implements Runnable {
    private boolean doStop = false;

    public synchronized void doStop() {
        this.doStop = true;
    }

    private synchronized boolean keepRunning() {
        return !this.doStop;
    }

    @Override
    public void run() {
        System.out.println("MyRunnable.run");
        while (keepRunning()) {
            System.out.println("Running");
            try {
                System.out.println("MyRunnable Thread.sleep");
                Thread.sleep(3L * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("MyRunnable -> after while loop");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        System.out.println("Starting the thread MyRunnable");

        Thread thread = new Thread(myRunnable);
        thread.start();

        try {
            System.out.println("Main thread invokes `Thread.sleep`");
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread invokes `stop`");
        myRunnable.doStop();

        System.out.println("Main thread waits for `MyRunnable` thread to be finished!");
    }
}
