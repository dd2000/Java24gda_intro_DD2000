package pl.sda.t01_d1sob1_datatypes;

public class Zad_1A_7_FahrenheitToCelsiusConverter {
/*
    W osobnej klasie FahrenheitConverter, w metodzie main()
    napisz program przekształcający dane o temperaturze podanej w skali Fahrenheit do skali Celsjusza.
    Dane wejściowe (temperatura w skali Fahrenheit) podać w inicjacji odpowiedniej zmiennej w programie.
    Sprawdź czy program poprawnie oblicza temperatury dla danych:
      32 °F = 0 °C; 212 °F = 100 °C
    Algorytm przeliczania:  Tc = (Tf-32)/1.8  = (Tf-32)/(9/5)

*/

    public static void main(String[] args){
        // write your code here

        double Tf = 132;
        System.out.println("\nTemperatura (w stopniach Fahrenheita) "+Tf+(char)176+"F to "+((Tf-32)/1.8)+(char)176+"C.");

    } // main

}  //class Zad_1A_7_FTCC
