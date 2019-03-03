package pl.sda.t02_d2niedz.n2_arrays;

/*
    Napisz metodę, która jako parametr przyjmuje zmienną typu String[] - tzn. tablicę Stringów
    i wyświetla wszystkie elementy tablicy na konsoli (użyj różnych rodzajów pętli).
*/



public class Zad_01_poprawione {
    private String[] tablica;

    public void setTablica(String[] tablica) {
        this.tablica = tablica;
    }  // setTablica(String[] tablica)

    public Zad_01_poprawione(String[] tablica) {
        this.tablica = tablica;
    }

    public String[] getTablica() {
        return tablica;
    }

    public void writeStrings(String[] tab){  // wypiszStringi(String[] tab)
        for (String str: tab) {
            System.out.println(str + ' ');
        } // foreach
    }// writeStrings(String[] tab)

} // Zad_01_poprawione
