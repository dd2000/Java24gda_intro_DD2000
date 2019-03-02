package pl.sda._JAVA_gda24_intro.coinpo.threelevel;

public class SubClass extends MiddleClass {
    private String middleField = "Private Middle Field";
    protected String field = "Subclass Field";

    public String sayHelloFromSubClass() {
        return "Hi! - from subclass";
    }

    public String sayHello() {
        return sayHelloFromSubClass() + " " + sayHelloFromMiddle() + " " + sayHelloFromRoot();
    }

    public String getMiddleField() {
        return middleField;
    }

    public String getField() {
        return field + " + " + super.getField();
    }
}