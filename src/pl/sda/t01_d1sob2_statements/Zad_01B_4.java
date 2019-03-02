package pl.sda.t01_d1sob2_statements;

public class Zad_01B_4 {
/*
    Napisz program, który wypisze na ekran konsoli,
    czy podany kod Unicode jest liczbą (0-9), małą literą (a-z) czy też wielką literą (A-Z).
    Kody każdej z grup znaków następują po sobie więc wystarczy
    znaleźć kod np. dla litery 'a' i 'z' i sprawdzić czy podany kod zawiera się w tym przedziale.
*/

    public static void main(String[] args){
        // write your code here

        int kod = 107;

        if(kod>=(char)'0' && kod<=(char)'9')
            System.out.print("\nKod Unicode równy "+kod+" to cyfra ('0'-'9') --> " + (char)kod );
        else if(kod>=(char)'a' && kod<=(char)'z')
            System.out.print("\nKod Unicode równy "+kod+" to mała litera('a'-'z') --> " + (char)kod );
        else if(kod>=(char)'A' && kod<=(char)'Z')
            System.out.print("\nKod Unicode równy "+kod+" to wielka litera('A'-'Z') --> " + (char)kod );
    } // main

}  //class pl.sda.t01_d1sob2_statements.Zad_01B_4

