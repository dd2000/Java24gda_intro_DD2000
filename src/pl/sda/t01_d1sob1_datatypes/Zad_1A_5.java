package pl.sda.t01_d1sob1_datatypes;

public class Zad_1A_5 {
/*
    Napisz program, który wyświetli na ekranie
    pięć pierwszych liter alfabetu:
      łacińskiego (zaczyna się od kodu: 65),
      hebrajskiego (zaczyna się od: 1488)
    i tybetańskiego (zaczyna się od: 3840)

*/

    public static void main(String[] args){
        // write your code here

        char firstLatin = 65, firstHebr = 1488, firstTybet = 3840;
        System.out.println("\nPierwsze pięć liter alfabetów:");
        System.out.print("łacińskiego:   ");
        for (int i=0; i<5; i++){
            System.out.print((char)(firstLatin+i));
        }  //for
        System.out.println();

        System.out.print("hebrajskiego:  ");
        for (int i=0; i<5; i++){
            System.out.print((char)(firstHebr+i));
        }  //for
        System.out.println();
        System.out.print("tybetańskiego: ");
        for (int i=0; i<5; i++){
            System.out.print((char)(firstTybet+i));
        }  //for
        System.out.println();

    } // main

}  //class pl.sda.t01_d1sob1_datatypes.Zad_1A_5
