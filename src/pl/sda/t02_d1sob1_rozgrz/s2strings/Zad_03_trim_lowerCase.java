package pl.sda.t02_d1sob1_rozgrz.s2strings;

/*
Napisz metodę, która jako argument otrzyma jedną zmienną typu String,
usunie z niej białe znaki z początku i końca tekstu oraz zamieni wszystkie litery na małe.
*/


public class Zad_03_trim_lowerCase {

    static String trimLower(String txt){
        return txt.trim().toLowerCase();
    }  //String trimLower



    public static void main(String[] args) {
        String text = "         Mała ALA MA wielkiego KOTKA!       ";
        System.out.println(trimLower(text)+"<<== koniec text(u)");

    }  //main


}  // Zad_03_trim_lowerCase
