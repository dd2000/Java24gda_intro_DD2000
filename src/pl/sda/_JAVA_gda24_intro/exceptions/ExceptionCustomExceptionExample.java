package pl.sda._JAVA_gda24_intro.exceptions;

import java.util.Scanner;

public class ExceptionCustomExceptionExample {
    public static void main(String[] args) {
        ExceptionCustomExceptionExample exceptionCustomExceptionExample = new ExceptionCustomExceptionExample();
        exceptionCustomExceptionExample.handleException();
    }

    public void handleException() {
        try {
            int numberFromUserWhichIsGreaterThanZero = getNumberFromUserWhichIsGreaterThanZero();
            System.out.println("Provided number which is greater than zero: " + numberFromUserWhichIsGreaterThanZero);
        } catch (NumberIsLessThanZeroException e) { // obsluga wlasnego wyjatku - tak samo jak dowolnego innego wyjatku
            System.out.println(e.getMessage());
        }
    }

    private int getNumberFromUserWhichIsGreaterThanZero() throws NumberIsLessThanZeroException { // i znow - mimo, ze nie musimy (wyjatek typu RuntimeException) to dobrze jest zadeklarowac w tym miejscu rzucany wyjatek
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number:");
        int number = scanner.nextInt(); // pomijamy tutaj lapanie wyjatku, gdy podana wartosc nie jest liczba
        if (number < 0) {
            throw new NumberIsLessThanZeroException("Provided number is less than zero!"); // rzucamy wlasny wyjatek gdy liczba jest mniejsza od 0
        }
        return number;
    }
}
