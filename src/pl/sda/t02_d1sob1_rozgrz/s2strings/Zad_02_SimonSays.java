package pl.sda.t02_d1sob1_rozgrz.s2strings;
/*
Napisz metodę, która zwróci tekst: “Simon says: [{text}]”, gdzie {text} - to argument metody.
Użyj konkatenacji lub StringBuildera.
*/

public class Zad_02_SimonSays {

    // metoda konkatenacji lub StringBuildera

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("\n1.Szymon mówi: ");
        String text = "...pocałujta w d... wójta!";
        System.out.println(sb.append(text));   //StringBuilder
        System.out.println( "2.Szymon mówi: ".concat(text));
        System.out.println( "3.Szymon mówi: "+text);  // pus jako operator konkatenacji
    } // main
}  // Zad_02_SimonSays class
