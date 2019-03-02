package pl.sda._JAVA_gda24_intro.stat;

public class StaticExample {
    private static String staticField;

    static {
        staticField = "example of static field";
    }

    public static void main(String[] args) {
        System.out.println(staticField);

        System.out.println(Counter.CLASS_NAME);

        long count1 = Counter.get();
        System.out.println(count1);

        for (int i = 0; i < 10; i++) {
            System.out.println(Counter.get());
        }

        ExternalClass.callCounter();
        InternalClass.callCounter();

        new ExternalClass.InnerStaticClass();
        new ExternalClass().new InnerNormalClass();
    }

    static class InternalClass {
        static void callCounter() {
            System.out.println("Counter from internal class: ");
            System.out.println(Counter.get());
        }
    }
}
