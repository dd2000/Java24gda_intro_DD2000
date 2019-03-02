package pl.sda._JAVA_gda24_intro.exceptions;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
        System.out.println(fruits[index]);
    }
}
