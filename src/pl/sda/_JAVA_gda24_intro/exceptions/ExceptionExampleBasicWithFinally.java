package pl.sda._JAVA_gda24_intro.exceptions;

import java.util.Scanner;

public class ExceptionExampleBasicWithFinally {
    public static void main(String[] args) {
        ExceptionExampleBasicWithFinally exceptionExampleBasic = new ExceptionExampleBasicWithFinally();
        exceptionExampleBasic.handleException();
    }

    public void handleException() {
        try { // probujemy wykonac kod ograniczony nawiasami klamrowymi
            int numberFromUserWhichIsGreaterThanZero = getNumberFromUserWhichIsGreaterThanZero();
            System.out.println("Provided number which is greater than zero: " + numberFromUserWhichIsGreaterThanZero);
        } catch (Exception e) { // `lapiemy` wyjatek, ktory moze miec miejsce w sekcji `try ... `
            System.out.println(e.getMessage());
        } finally { // sekcja `finally` jest opcjonalna i wykona sie zawsze - niezaleznie czy wystapi wyjatek czy nie
            System.out.println("I'm happy ;) I can exit and stop the program!");
        }
    }

    private int getNumberFromUserWhichIsGreaterThanZero() throws Exception { // w sygnaturze musi pojawic sie wyjatek rzucany w ciele metody, bo jest to wyjatek typu `Exception`
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number:");
        int number = scanner.nextInt(); // pomijamy tutaj lapanie wyjatku, gdy podana wartosc nie jest liczba
        if (number < 0) {
            throw new Exception("Provided number is less than zero!"); // rzucamy wyjatek gdy liczba jest mniejsza od 0
        }
        return number;
    }
}
