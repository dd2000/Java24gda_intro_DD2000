package pl.sda._JAVA_gda24_intro.coinpo.threelevel;

public class RootClass {
    private String rootField = "Private Root Field";
    protected String field = "Root Field";

    public String sayHelloFromRoot() {
        return "Hi! - from root";
    }

    public String sayHello() {
        return sayHelloFromRoot();
    }

    public String getRootField() {
        return rootField;
    }

    public String getField() {
        return field;
    }
}
