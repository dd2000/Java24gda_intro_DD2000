package pl.sda._JAVA_gda24_intro.stat;

public class Counter {
    public final static String CLASS_NAME = "Counter";
    private static long counter = 0;

    public static long get() {
        ++counter;
        return counter;
    }
}
