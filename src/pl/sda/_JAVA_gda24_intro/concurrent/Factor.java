package pl.sda._JAVA_gda24_intro.concurrent;

import java.math.BigInteger;

public class Factor implements Runnable {
    private int num;

    public Factor(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        // uncomment code below and in the end of the method
        // to check how much time takes to calculate each factor number
//        long start = System.currentTimeMillis();
        BigInteger factor = factorOf();
        // uncomment code below to display factor result
//        System.out.println("Factor of: " + num + " = " + factor);

//        long end = System.currentTimeMillis();
//        System.out.println("Time: " + (end - start) + " ms");
    }

    private BigInteger factorOf() {
        BigInteger factorial = BigInteger.valueOf(1);
        if (0 == num) {
            return factorial;
        }
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
