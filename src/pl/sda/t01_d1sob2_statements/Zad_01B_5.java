package pl.sda.t01_d1sob2_statements;

public class Zad_01B_5 {
/*
    Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia
    (dla 1 - "poniedziałek", 2 - "wtorek" itp).
    Dodatkowo wyświetl, ile dni zostało do weekendu, dla poniedziałku - 5 dni, wtorku - 4 itp.

*/

    public static void main(String[] args){
        // write your code here

        int dzien = 6;

        System.out.println();

        switch (dzien) {
            case 1:
                System.out.println("Pierwszy dzień tygodnia: poniedziałek.");
                break;
            case 2:
                System.out.println("Drugi dzień tygodnia: wtorek.");
                break;
            case 3:
                System.out.println("Trzeci dzień tygodnia: środa.");
                break;
            case 4:
                System.out.println("Czwarty dzień tygodnia: czwartek.");
                break;
            case 5:
                System.out.println("Piąty dzień tygodnia: piątek.");
                break;
            case 6:
                System.out.println("Szósty dzień tygodnia: sobota.");
                break;
            case 7:
                System.out.println("Siódmy dzień tygodnia: niedziela.");
                break;
            default:
                System.out.println("Podana liczba nie odpowiada dniom tygodnia.");
        } //switch
        if (dzien>=1 && dzien<=5) System.out.println("Liczba dni pozostałych do weekendu: " + (6-dzien)+".");
        if (dzien>5 && dzien<=7) System.out.println("Trwa weekend!");
    } // main

}  //class pl.sda.t01_d1sob2_statements.Zad_01B_5
