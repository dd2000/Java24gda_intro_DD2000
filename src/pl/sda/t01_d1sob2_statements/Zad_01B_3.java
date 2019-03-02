package pl.sda.t01_d1sob2_statements;

public class Zad_01B_3 {
/*
    Napisz program, który wypisze na ekran konsoli cyfrę arabską,
    dla podanej liczby rzymskiej (od 1 do 9).
    Czyli np. dla 'I' wypisze 1, dla 'V' 5 itp.
    Obsłuż przypadek gdy podana liczba rzymska jest nieprawidłowa.
*/

    public static void main(String[] args){
        // write your code here

        String rzymska = "VI";

        System.out.print("\nCyfra rzymska "+rzymska+" to arabska cyfra równa: ");

        switch (rzymska) {
            case "I":
                System.out.println("1.");
                break;
            case "II":
                System.out.println("2.");
                break;
            case "III":
                System.out.println("3.");
                break;
            case "IV":
                System.out.println("4.");
                break;
            case "V":
                System.out.println("5.");
                break;
            case "VI":
                System.out.println("6.");
                break;
            case "VII":
                System.out.println("7.");
                break;
            case "VIII":
                System.out.println("8.");
                break;
            case "IX":
                System.out.println("9.");
                break;
            default:
                System.out.println("Nie ma takiej cyfry rzymskiej.");
        } //switch
    } // main

}  //class pl.sda.t01_d1sob2_statements.Zad_01B_3


