package pl.sda.t02_d1sob1_rozgrz;

public class FamilyTest {
    public static void main(String[] args) {
        // utwórz kilka osób (person), rodzine, wypisz o nich informacje
        Person ojciec = new Person("Jan","Kowalski",56,"facet");
        Person matka = new Person("Anna","Kowalska",55,"kobieta");
        Person dziecko = new Person("Krzys","Kowalski", 13,"chłopiec");
        Family rodzina = new Family(ojciec,matka,dziecko);

        System.out.println(rodzina.toString());
    }
}
