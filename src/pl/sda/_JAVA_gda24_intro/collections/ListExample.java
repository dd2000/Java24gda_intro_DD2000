package pl.sda._JAVA_gda24_intro.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // z lewej strony zawsze podajemy typ ogolny kolekcji
        // nastepnie w nawiasach ostrych <> typ danych jaki bedzie przetrzymywala nasza kolekcja
        // z prawej strony rownania wybieramy konkretna kolekcje
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("orange");
        fruits.add("banana");

        System.out.println("Collection size: " + fruits.size());

        // ponizej 3 sposoby na wyswietlanie wszystkich elementow kolekcji typu List

        // #1 - wykorzystanie obiektu typu Iterator pochodzacego z interfejsu Iterable
        System.out.println("\nPrinting all elements from the collection using `Iterator`");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // #2 - wykorzystanie petli foreach
        System.out.println("\nPrinting all elements from the collection using `for-each` loop");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // #3 - wykorzystanie standardowej petli for - da sie to samo oczywiscie zrobic za pomoca while czy do .. while
        System.out.println("\nPrinting all elements from the collection using standard `for` loop");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
    }
}
