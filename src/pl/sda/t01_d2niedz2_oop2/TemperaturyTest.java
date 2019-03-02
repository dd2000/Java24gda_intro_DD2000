package pl.sda.t01_d2niedz2_oop2;

import java.util.Scanner;

public class TemperaturyTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Poddaj temperaturę w stopniach Celsjusza: ");
        double tc=in.nextDouble();

        Temperatury tt = new Temperatury();
        tt.setCe(tc);
        tt.setFa(tt.convertToFahrenheit(tt.getCe()));

        System.out.println("Zapisane temperatury to:");
        System.out.println("Stopnie Celsjusza: "+tt.getCe());
        System.out.println("Stopnie Fahrenheita: "+tt.getFa());
    }
}
