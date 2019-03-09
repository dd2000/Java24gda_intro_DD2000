package pl.sda.t03_d1sob1_abstrakcyjne_kl_met._5_Daty_StringFormats._wprowadzenie.strings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class StringFormats {
    public static void main(String[] args) {
        String greetings = String.format("Hello Folks, welcome to %s !", "SDA course");
        System.out.println(greetings);

        System.out.println();
        System.out.printf("|%s|%n", "Hello World");
        System.out.printf("|%20s|%n", "Hello World");
        System.out.printf("|%-20s|%n", "Hello World");
        System.out.printf("|%-20.5s|%n", "Hello World");

        System.out.println();
        System.out.printf("|%d|%n", 1234);
        System.out.printf("|%10d|%n", 1234);
        System.out.printf("|%-10d|%n", 1234);
        System.out.printf("|%010d|%n", 1234);

        System.out.println();
        System.out.printf("|%f|%n", 55.6789);
        System.out.printf("|%15f|%n", 55.6789);
        System.out.printf("|%15.2f|%n", 55.6789);
        System.out.printf("|%-15.2f|%n", 55.6789);
        System.out.printf("|%015.2f|%n", 55.6789);

        System.out.println();
        System.out.printf("Minutes: %tM%n", new Date());
        System.out.printf("Day of week (uppercase): %TA%n", LocalDate.now());
        System.out.printf("Month: %tB%n", ZonedDateTime.now());
        System.out.printf("Year: %tY%n", LocalDateTime.now());

        System.out.println();
        System.out.printf("|%10s|%-10.2s|%10s|%n", "columnA", "columnB", "columnC");
        System.out.printf("|%10.2f|%-10.4f|%10.0f|%n", 45.1234, 45.1234, 45.1234);
    }
}
