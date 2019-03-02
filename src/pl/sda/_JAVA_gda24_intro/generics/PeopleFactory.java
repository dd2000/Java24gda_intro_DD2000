package pl.sda._JAVA_gda24_intro.generics;

public class PeopleFactory {

    public static void main(String[] args) {
        People<Student, Gender> people = new People<>(new Student("Maciek", "Rzepiński"), Gender.MALE);

        System.out.println(people.getK().getFirstName() + people.getK().getLastName());
        System.out.println(people.getV());
    }

}
