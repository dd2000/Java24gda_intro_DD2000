package pl.sda._JAVA_gda24_intro.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadRunner {
    private static long FACTOR_OF = 10;

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        // #1
        customThread();

//        // #2
        runnable();
//
//        // #3
        executorService();
//
//        // #4
        standardWay();

        // #5
        factor(10);
    }

    private static void customThread() {
        System.out.println("Start CustomThread!");

        CustomThread thread1 = new CustomThread("Custom Thread 1");
        thread1.start();

        CustomThread thread2 = new CustomThread("Custom Thread 2");
        thread2.start();

        System.out.println("Done!");
    }

    private static void runnable() {
        System.out.println("Start CustomRunnable!");

        CustomRunnable customRunnable = new CustomRunnable();

        Thread thread1 = new Thread(customRunnable);
        thread1.start();

        Thread thread2 = new Thread(customRunnable);
        thread2.start();

        System.out.println("Done!");
    }

    private static void executorService() throws InterruptedException {
//        System.out.println("Threads: " + Runtime.getRuntime().availableProcessors());

        long start = System.currentTimeMillis();
        System.out.println("Start ExecutorService!");

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (int i = 1; i <= FACTOR_OF; i++) {
            executorService.execute(new Factor(i));
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println("Done!");

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");
    }

    private static void standardWay() {
        long start = System.currentTimeMillis();

        System.out.println("Start standard way!");
        for (int i = 1; i <= FACTOR_OF; i++) {
            Factor factor = new Factor(i);
            factor.run();
        }

        System.out.println("Done!");
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");
    }

    // calculate simple factor of the number
    private static void factor(int num) {
        System.out.println("Start Factor!");

        Factor factor = new Factor(num);
        Thread thread = new Thread(factor);
        thread.start();

        System.out.println("Done!");
    }
}
