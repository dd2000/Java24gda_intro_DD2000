package pl.sda._JAVA_gda24_intro.oop;

public class AnimalZoo {

    public static void main(String[] args) {
        // deklaracja obiektu klasy Animal
        Animal animal1 = null; // null oznacza, że obiekt nie istnieje, nie ma adresu w pamięci
//        System.out.println(animal1);

        // próbujemy wywołać metodę na nieistniejącym obiekcie, otrzymujemy w ten sposób błąd: NullPointerException -> NPE
//        animal1.display();

        // deklaracja i inicjalizacja obiektu klasy Animal
        Animal animal2 = new Animal("mammal", "red", 15);
        // wyświetlona zostanie nazwa kwalifikowalna klasy + adres utworzonego obiektu w pamięci = referencja
        System.out.println(animal2);

        String result = animal2.display();
        System.out.println(result);
        System.out.println(animal2.display());
    }

}
