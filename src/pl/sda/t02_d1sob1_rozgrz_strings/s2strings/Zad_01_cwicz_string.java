package pl.sda.t02_d1sob1_rozgrz_strings.s2strings;
/*
    Napisz klasę, która wykorzysta większość z metod dostępnych w klasie String.
*/

public class Zad_01_cwicz_string {

    static String my_trim(String tst){
        return tst.trim().toLowerCase();
    }

    public static void main(String[] args) {
        String tekst = "Ala ma kota.";
        String tekst2 = "Ola ma psa.";
        System.out.println("Wynik metody length: "+tekst.length()); // tekst Ala.... ma 11 znaków
        System.out.println("Wynik metody toUperCase: "+tekst.toUpperCase()); // tekst ALA....
        System.out.println("Wynik metody konkatenacja: "+tekst.concat(" ").concat(tekst2)); // metoda concat
        // ........
        // ... próbki innych metod klasy String


        System.out.println(my_trim("      ALA ma koteczka        ")+"<< koniec łańcucha");


    }  // main
} // Zad_01_cwicz_string
