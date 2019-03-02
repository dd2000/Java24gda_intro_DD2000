package pl.sda.t01_d2niedz1_oop;

public class Animal {
    // pola (właściwości)
    private String genre; // gatunek
    private String color;
    private int age; // wiek
    private int numberOfLegs; // liczba odnóży
    private String sex; // płeć
    private boolean isMoving; // porusza się, jest poruszający się

    // metody - zachowania obiektów - wykonanie pewnej czynnosci na naszym obiekcie, która wykonuje coś
    // [modyfikator_dostępu] typ_wyniku nazwa([parametry]) {[kod - ciało metody]}

    //Zachowanie obiektu
    //Zestaw operacji, które można wykonywać na obiektach klasy.
    // W Javie operacje klasy nazywamy metodami klasy.
    // Są one wspólne dla wszystkich obiektów danej klasy.

    // (**) psvm - skrót do tworzenia metody main()
    // (**) sout - skrót so utworzenia polecenia System.out.println()
    // (**) najedź kursorem z CTRL-em na metodę, a wyświetli się, czego ta metoda potrzebuje

    // poniżej: utworzony własny konstruktor;
    // gdy tworzysz własny konstruktor, to
    // ponownie musisz zdefiniować konstruktor domyślny - bez parametrów w wywołaniu

    public Animal(String genre, String color, int age, int numberOfLegs, String sex, boolean isMoving) {
        this.genre = genre;
        this.color = color;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.sex = sex;
        this.isMoving = isMoving;
    }

    public void move() {    //metoda: poruszanie się , nic nie zwraca
        isMoving = true;
    } // move()

    public String display(){  //metoda: wyświetl, zwraca wartość typu String
        return "Genre: "+ genre + " color: " + color + " age: " + age;
    } // display()

    public  void setGenre(String genre) {   // metoda: ustawia płeć określoną jako parametr wywołania genre
        this.genre = genre;  // do pola genre obiektu (this) wstaw genre(parametr wywołania metody setGenre)
    } // setGenre()

    public void setColor(String kolor) {  //metoda: ustawia pole color na wartość kolor podaną jako argument
        this.color = kolor;
    } // setColor()

    public void setAge(int age){ // metoda: ustawia wiek na wartość podaną w parametrze int age
        this.age = age;
    }  // setAge()

    // Metody dostępowe (gettery / settery)
    //Metody służące do ustawiania i pobierania wartości z pól obiektu.
    // Pola są "ukrywane" przed innymi klasami, a dostęp do nich odbywa się przez metody dostępowe.
    // Nie jest to wymóg języka tylko dobra praktyka tworzenia oprogramowania obiektowego.
    // *** !!! ***
    // (**) Alt+Insert  ==> Setter --> z menu wybieramy z wciśniętym klawiszem CTRL pola,
    // które chcemy, by dla nich wygenerować metody set...

    // przykłady wygenerowanych getterów (metod pobierających wartości) klawiszami ALT+INTER poniżej
    public String getGenre() {
        return genre;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getSex() {
        return sex;
    }

    public boolean isMoving() {
        return isMoving;
    }
}  // pl.sda.t01_d2niedz1_oop.Animal class
