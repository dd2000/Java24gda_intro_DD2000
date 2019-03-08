package pl.sda.t02_d1sob1_rozgrz_strings;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String sex;

    public String getMane() {
        return name;
    }

    public void setMane(String mane) {
        this.name = mane;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    // metoda wstawiona przez ALT+INS
    @Override
    public String toString() {
        return "pl.sda.t02_d1sob1_rozgrz.Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    } // toString - pl.sda.t02_d1sob1_rozgrz.Person
} // pl.sda.t02_d1sob1_rozgrz.Person
