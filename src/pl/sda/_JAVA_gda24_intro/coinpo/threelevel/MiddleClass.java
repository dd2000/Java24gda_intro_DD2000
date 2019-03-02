package pl.sda._JAVA_gda24_intro.coinpo.threelevel;

public class MiddleClass extends RootClass {
    private String middleField = "Private Middle Field";
    protected String field = "Middle Field";

    public String sayHelloFromMiddle() {
        return "Hi! - from middle";
    }

    public String sayHello() {
        return sayHelloFromMiddle();
    }

    public String getMiddleField() {
        return middleField;
    }

    public String getField() {
        return field + " + " + super.field;
    }
}
