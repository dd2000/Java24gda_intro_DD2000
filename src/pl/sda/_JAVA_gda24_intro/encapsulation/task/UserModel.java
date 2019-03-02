package pl.sda._JAVA_gda24_intro.encapsulation.task;

public class UserModel {
    String firstName;
    private String lastName;
    protected final int AGE = 55;

    public String getFirstName() {
        return firstName;
    }
}
