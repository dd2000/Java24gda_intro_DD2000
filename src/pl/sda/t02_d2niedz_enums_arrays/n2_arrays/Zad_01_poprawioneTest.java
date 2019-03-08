package pl.sda.t02_d2niedz_enums_arrays.n2_arrays;

// wyświetla wszystkie elementy String tablicy (wpisane wcześniej do pola tablica obiektu) na konsoli

public class Zad_01_poprawioneTest {
    public static void main(String[] args) {
        String[] testowa = {"1","pięć","Ala","kot", "wesołe 3 koty"};
        Zad_01_poprawione myTab = new Zad_01_poprawione(testowa);
        myTab.writeStrings(myTab.getTablica());
    } //main
} // Zad_01_poprawioneTest
