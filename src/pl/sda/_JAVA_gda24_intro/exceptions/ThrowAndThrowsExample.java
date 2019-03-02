package pl.sda._JAVA_gda24_intro.exceptions;

import java.util.Scanner;

public class ThrowAndThrowsExample {
    private static int COUNTER = 0;

    public static void main(String[] args) {
        ThrowAndThrowsExample example = new ThrowAndThrowsExample();
        while (true) {
            COUNTER++;
            int number = example.getNumber();
            System.out.println("Provided number: " + number);
            if (123 == number) {
                break;
            }
        }
    }

    // #1 wyjatek nie jest obslugiwany
//    public int getNumber() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Provide a number: ");
//        return scanner.nextInt();
//    }

    // #2 obslugiwany jest wyjatek typu Exception - koniecznosc jego obslugi
//    public int getNumber() throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Provide a number (123)");
//        String value = scanner.next();
//
//        if (!"123".equals(value)) {
//            throw new IOException(value + " is not equal 123");
//        }
//
//        return Integer.parseInt(value);
//    }

    // #3 obslugujemy ten sam wyjatek typu Exception z dodatkowa klauzula `finally`, ktora wykona sie niezaleznie czy wyjatek wystapi czy nie
//    public int getNumber() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Provide a number (123)");
//        String value = scanner.next();
//        int number = 0;
//        try {
//            number = parseValue(value);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Finally!");
//        }
//        return number;
//    }

    // #4 obsluga wyjatku typu RuntimeException
    public int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number (123)");
        String value = scanner.next();
        return parseValue(value);
    }

    // odnosie sie do #1 - #2 - #3
//    private int parseValue(String value) throws IOException {
//        if (!"123".equals(value)) {
//            throw new IOException(value + " is not equal 123");
//        }
//        return Integer.parseInt(value);
//    }

    // odnosi sie do #4
    private int parseValue(String value) { // throws jest opcjonalne w tym miejscu
        if (!"123".equals(value)) {
            throw new IllegalArgumentException(value + " is not equal 123");
        }
        return Integer.parseInt(value);
    }

}
