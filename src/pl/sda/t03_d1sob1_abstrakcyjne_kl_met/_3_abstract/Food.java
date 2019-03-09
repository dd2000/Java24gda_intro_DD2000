package pl.sda.t03_d1sob1_abstrakcyjne_kl_met._3_abstract;

//    1.Utwórz klasę abstrakcyjną o nazwie Food i dodaj do niej metodę abstrakcyjną getTaste(),
//    która zwróci string z opisem smaku jedzenia
//    Dodaj klasy: Chicken, Ham, Carrot, Salad rozszerzające klasę Food
//     oraz zaimplementuj w każdej z nich wymaganą metodę.
//
//    2.Utwórz dwie nowe klasy abstrakcyjne: Meat i Vegetable rozszerzające klasę Food.
//    Zmień klasy bazowe dla klas: Chicken, Ham, Carrot, Salad tak by dziedziczyły po jednej z klas: Meat lub Vegetable
//
//    3.Dodaj do klasy Food metodę abstrakcyjną getType(),
//      która zwróci rodzaj jedzenia w postaci enuma (utwórz enum).
//    W klasach Meat i Vegetable zaimplementuj nową metodę.
//
//    4.W klasie Food dodaj pole name i zwykłą metodę (gettera) do pobierania nazwy.
//    Stwórz konstruktor, który będzie ustawiał pole name.
//    Stwórz odpowiednie konstruktory w klasach pochodnych.
//
//    5.W klasie Food dodaj metodę describe(), która wypisze na ekran
//    informacje o nazwie, typie i smaku jedzenia.
//    Sprawdź swój kod, stwórz po jednym obiekcie z każdej klasy: Chicken, Ham, Carrot, Salad
//    i wyświetl na ekran ich opis.


public abstract class Food {
    //private String taste;  // pole "smak", w zadaniu niekreslone, czy ma być to pole
    private String name;

    // konstruktor
    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getTaste(); // metoda abstarakcyjna nie wymaga ciała - pojawi się ono później [FORWARD]
    public abstract FoodType getType();
    // pkt.5* nie zrobione
}  // class Food
