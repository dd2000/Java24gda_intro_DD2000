package pl.sda.t02_d1sob1_rozgrz.s3_loops;

/*
    Napisz metodę która sprawdzi czy dwa podane Stringi (zmienne typu String) są takie same
    - bez użycia metody equals().
    Podpowiedź: możesz porównać oba teksty znak po znaku używając jednej z metod klasy String
*/

public class Zad_04_porownaj_stringi {

    private static String str1 = "pierwszy";
    private static String str2 = "drugi";

    // metoda zwraca długość więhszego łańcucha
    public static int howMatch(){
        if ((str1.length()==0) && (str2.length()==0)) return 0;
        if (str1.length()>str2.length())
            return str1.length();
        else return str2.length();
    } // howMatch()

    // metoda porównuje łańcuchy nie używając equals
    public static boolean takieSame(String str1, String str2){
        int len = howMatch();
        if (len==0) return true;
        if (str1.length() != str2.length()) return false;

        boolean zgodne = true; // zakładamy, że łańcuchy są takie same
        for (int i=0; i <= len-1; i++){
            if (str1.charAt(i) != str2.charAt(i)) return false;  // gdy się różnią znakiem, FALSE
        }  // for
        return zgodne;
    } // takieSame(String txt1, String txt2)

    public static void main(String[] args) {
        System.out.println("\nWynik porównania łańcuchów:");
        if (takieSame(str1,str2))
            System.out.println("łańcuchy są takie same");
        else System.out.println("łańcuchy są RÓŻNE !");
    } // main

}  // Zad_04_porownaj_stringi
