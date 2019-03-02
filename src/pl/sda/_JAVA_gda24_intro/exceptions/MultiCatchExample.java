package pl.sda._JAVA_gda24_intro.exceptions;

import java.nio.charset.UnsupportedCharsetException;
import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        MultiCatchExample example = new MultiCatchExample();
        // petla w sposob ciagly pobierajaca dane od uzytkownika
        while (true) {
            System.out.println("Got: " + example.getValue());
        }
    }

    // # 1 sposob na obsluge wyjatkow
//    private int getValue() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Provide a number: ");
//        String value = scanner.next();
//        int number = 0;
//
//        // ponizsza sekcja rozroznia obsluge wyjatkow, ktore moga wystapic w sekcji try { ... }
////        try {
////            number = parseValue(value);
////            inRange(number);
////        } catch (NumberFormatException nfe) {
////            // specjalna obsluga wyjatku NumberFormatException
////            System.out.println("NumberFormatException!");
////        } catch (UnsupportedCharsetException uce) {
////            // specjalna obsluga wyjatku UnsupportedCharsetException
////            System.out.println("UnsupportedCharsetException!");
////        }
//
//        // ponizsza sekcja powoduje, ze dwa wyjatki, ktore moga wystapic w sekcji try { .. } sa obslugiwane jednakowo
//        // dodatkowo dla pokazania kontekstu dodana jest sekcja catch dla RuntimeException, ktora determinuje fakt obslugi wszystkich innych wyjatkow
//        try {
//            number = parseValue(value);
//            inRange(number);
//        // if (rzucony_wyjatek == NumberFormatException || rzucony_wyjatek == NumberFormatException)
//        } catch (NumberFormatException | UnsupportedCharsetException e) {
//            // oba wyjatki obslugujemy w taki sam sposob
//            System.out.println("NumberFormatException or UnsupportedCharsetException!");
//        } catch (RuntimeException e) {
//            // definiujemy sobie obsluge kazdego innego wyjatku typu RuntimeException
//        }
//
//        return number;
//    }

    // #2 sposob na obsluge wlasnych wyjatkow, ktore zefiniowac mozemy w osobnych klasach
    private int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number: ");
        String value = scanner.next();
        int number = 0;
        try {
            number = parseValue(value);
            inRange(number);
        } catch (NumberIsLessThanZeroException niltz) {
            // specjalna obsluga wyjatku NumberIsLessThanZero
            System.out.println("NumberIsLessThanZero!");
        } catch (NumberIsGreaterThan100Exception nigtz) {
            // specjalna obsluga wyjatku NumberIsGreaterThan100
            System.out.println("NumberIsGreaterThan100!");
        } catch (UnsupportedCharsetException uce) {
            // specjalna obsluga wyjatku UnsupportedCharsetException
            System.out.println("UnsupportedCharsetException!");
        }

        return number;
    }

    private int parseValue(String value) throws UnsupportedCharsetException {
        int number = 0;
        try {
            number = Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            throw new UnsupportedCharsetException("Provied value is not a number!");
        }
        return number;
    }

    private boolean inRange(int number) throws NumberIsLessThanZeroException, NumberIsGreaterThan100Exception {
        if (number < 0) {
            throw new NumberIsLessThanZeroException("Provided number is less than 0");
        }

        if (number > 100) {
            throw new NumberIsGreaterThan100Exception("Provided number is greater than 100");
        }

        return true;
    }


}
