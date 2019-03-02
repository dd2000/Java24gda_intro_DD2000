package pl.sda._JAVA_gda24_intro.exceptions;

import java.util.Scanner;

public class RuntimeExceptionExampleBasic {
    public static void main(String[] args) {
        RuntimeExceptionExampleBasic exceptionExampleBasic = new RuntimeExceptionExampleBasic();
        exceptionExampleBasic.handleException();
    }

    public void handleException() {
        try { // probujemy wykonac kod ograniczony nawiasami klamrowymi
            int numberFromUserWhichIsGreaterThanZero = getNumberFromUserWhichIsGreaterThanZero();
            System.out.println("Provided number which is greater than zero: " + numberFromUserWhichIsGreaterThanZero);
        } catch (RuntimeException e) { // `lapiemy` wyjatek, ktory moze miec miejsce w sekcji `try ... `
            System.out.println(e.getMessage());
        }
    }

    // w sygnaturze MOZE pojawic sie wyjatek rzucany w ciele metody, jest to opcjonalne, bo mamy tutaj wyjatek typu RuntimeException
    // dobra praktyka jest podawac jaki wyjatek (nawet typu RuntimeException) moze wystapic
    private int getNumberFromUserWhichIsGreaterThanZero() throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number:");
        int number = scanner.nextInt(); // pomijamy tutaj lapanie wyjatku, gdy podana wartosc nie jest liczba
        if (number < 0) {
            throw new RuntimeException("Provided number is less than zero!"); // rzucamy wyjatek gdy liczba jest mniejsza od 0
        }
        return number;
    }
}
