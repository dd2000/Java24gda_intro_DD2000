package pl.sda.t02_d2niedz_enums_arrays.n2_arrays;

/*
    Napisz metodę, która jako parametr przyjmuje zmienną typu String[] - tzn. tablicę Stringów
    i wyświetla wszystkie elementy tablicy na konsoli (użyj różnych rodzajów pętli).
*/


public class Zad_01_arr_String {

    public static void wypisz(String[] test){
        for (String str : test){
            System.out.println(str);
        } //for
    } // wypisz


    public static void main(String[] args) {
        String[] tab = new String[5];
        tab[0] = "Ala";
        tab[1] = "Ola";
        tab[2] = "Kasia";
        tab[3] = "Basia";
        tab[4] = "Dorota";

        wypisz(tab);
    } // main
} // Zad_01_arr_String
