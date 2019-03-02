package pl.sda.t01_d1sob2_statements;

public class Zad_01B_1 {
/*
    Napisz program, który wypisze na ekran konsoli,
    czy dana liczba całkowita znajduje się w przedziale 1-10, 11-100, 101-1000, 1001-10000,
    czy też może jest mniejsza od 0 lub większa od 10000.
    Parametrem wejściowym niech będzie zmienna zainicjowana na początku programu.
*/

    public static void main(String[] args){
        // write your code here

        int x = 100001;

        System.out.println();
        if (x<0){
            System.out.println("Liczba "+x+" jest mniejsza od 0 (ujemna).");
        } else {
            if (x>0){
              if (x<=10) System.out.println("Liczba "+x+" jest w przedziale <1,10>.");
              else if (x<=100) System.out.println("Liczba "+x+" jest w przedziale <11,100>.");
                   else if (x<=1000) System.out.println("Liczba "+x+" jest w przedziale <101,1000>.");
                        else if (x<=10000) System.out.println("Liczba "+x+" jest w przedziale <1001,10000>.");
                             else System.out.println("Liczba "+x+" jest większa od 10000.");
            } //x>0
        } //if
    } // main

}  //class pl.sda.t01_d1sob2_statements.Zad_01B_1

