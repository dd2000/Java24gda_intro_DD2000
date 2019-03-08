package pl.sda.t02_d1sob1_rozgrz_strings.s1encapsulation.task.user;

public class UserModel {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }


    public UserModel(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    } // konstruktor


}

