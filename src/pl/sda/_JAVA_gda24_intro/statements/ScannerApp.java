package pl.sda._JAVA_gda24_intro.statements;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String name = scanner.next();

        System.out.print("Podaj swój wiek: ");
        int age = scanner.nextInt();

        System.out.println();
        System.out.println("Witaj " + name + " twój wiek to: " + age);
    }
}
