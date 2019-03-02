package pl.sda.t02_d1sob1_rozgrz.s1encapsulation.task.user;

public class UserManager {
    public UserModel user;

    private void createUser(String firstName, String lastName, int age) {

        user = new UserModel(firstName,lastName,age);
    } // konstruktor

    protected UserModel getUser() {
        return user;
    }
}
