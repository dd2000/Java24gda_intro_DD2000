package pl.sda._JAVA_gda24_intro.functional.exercices;

public class Tasks {

    public static void main(String[] args) {
        //#1
        //useLambdas();

        //#2
        useStreams();
    }

    /**
     * 1. Stwórz i użyj lambdę która:
     * - stworzy obiekt klasy Double (Supplier)
     * - pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
     * - sprawdzi czy podany string ma długość > 10 (Predicate)
     * - przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
     */
    private static void useLambdas() {
    }

    /**
     * 2. Stwórz i użyj strumień danych (Stream):
     * - stwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
     * - stwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
     * - stwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
     *   i stwórz listę przetworzonych elementów
     * - stwórz stream obiektów Person i stwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
     * - stwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Path.get("."))
     */
    private static void useStreams() {
    }
}