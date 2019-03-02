package pl.sda.t01_d1sob1_datatypes;

public class Zad_1A_4 {
/*
    Napisz program, który utworzy jedną zmienną,
    a następnie wypisze na ekran tekst:
        true jeżeli wartość tej zmiennej jest podzielna przez 3
        i jednocześnie przez 5
    lub false w przeciwnym przypadku.
*/

    public static void main(String[] args){
        // write your code here

        int x=33;
        System.out.println("\nCzy liczba "+x+" jest podzielna przez 3 i jednocześnie przez 5?");
        System.out.println(0 == ((x%3) + (x%5))); //porównuje zero z sumą reszt z dzielenia -> daje true lub false

    } // main

}  //class pl.sda.t01_d1sob1_datatypes.Zad_1A_4
