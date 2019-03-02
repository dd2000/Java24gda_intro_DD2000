package pl.sda._JAVA_gda24_intro.stat;

public class ExternalClass {
    public static void callCounter() {
        System.out.println("Counter from external class: ");
        System.out.println(Counter.get());
    }

    public static class InnerStaticClass {
        public InnerStaticClass() {
            System.out.println("InnerStaticClass");
        }
    }

    protected class InnerNormalClass {
        InnerNormalClass() {
            System.out.println("InnerNormalClass");
        }
    }
}
