package pl.sda._JAVA_gda24_intro.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMultiExceptionsInOneCatchExample {
    public static void main(String[] args) {
        ExceptionMultiExceptionsInOneCatchExample exceptionMultiExceptionsInOneCatchExample = new ExceptionMultiExceptionsInOneCatchExample();
        exceptionMultiExceptionsInOneCatchExample.handleException();
    }

    public void handleException() {
        try {
            int numberFromUserWhichIsGreaterThanZero = getNumberFromUserWhichIsGreaterThanZero();
            System.out.println("Provided number which is greater than zero: " + numberFromUserWhichIsGreaterThanZero);
        // ponizej okreslamy lapanie dwoch wyjatkow w ramach jednego bloku `catch` - dzieki temu mozemy te dwa wyjatki `obsluzyc` w taki sam sposob i nie musimy powielac kodu
        } catch (InputMismatchException | IOException e) {
            System.out.println("InputMismatchException OR IOException > " + e.getMessage());
        }
    }

    // ponizej deklarujemy, ze metoda moze `rzucac` dwa wyjatki
    // deklaracja IOException jest obowiazkowa, bo jest to typ Exception
    // deklaracja InputMismatchException jest opcjonalna, bo wyjatek jest typu RuntimeException i wystepuje w przypadku wywolania metody `.nextInt()` dla Scannera - polecam zajrzec do srodka poprzez Ctrl + Lewy Click Myszy
    private int getNumberFromUserWhichIsGreaterThanZero() throws IOException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number:");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new IOException("Provided number is less than zero!");
        }
        return number;
    }
}
