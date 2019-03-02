package pl.sda.t01_d2niedz2_oop2;
/*
    Utwórz klasę pl.sda.t01_d2niedz2_oop2.Triangle i napisz metodę isRectangular(),
    która jako argumenty przyjmować będzie trzy liczby całkowite.
    Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach
    można zbudować trójkąt prostokątny. Wzór który może pomóc: c^2 = a^2 + b^2.
*/

public class Triangle {
    //pola
    private double a;
    private double b;
    private double c;

    // metody

    // konstruktor obiektów pl.sda.t01_d2niedz2_oop2.Triangle
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    } // konstruktor pl.sda.t01_d2niedz2_oop2.Triangle

    // metoda sprawdzająca, czy trójkąt jest prostokątny
    public boolean checkTriangle() {
        boolean wynik = false;

        //gdy c jest największe
        if ((c >= a) && (c >= b))
         { if (c * c == (a * a + b * b)) wynik = true; }

        //gdy b jest największe
        if ((b >= a) && (b >= c))
         { if (b * b == (a * a + c * c)) wynik = true; }

        //gdy a jest największe
        if ((a >= c) && (a >= b))
         { if (a * a == (c * c + b * b)) wynik = true; }
        return wynik;
    } // checkTriangle

} // pl.sda.t01_d2niedz2_oop2.Triangle class
