package pl.sda._JAVA_gda24_intro.io;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class IoExamples {
    private static final String FILE_NAME_TO_WRITE = "./src/pl/sda/io/io-example.txt";
    private static final String FILE_NAME_TO_READ = "./src/pl/sda/io/read-file-example.txt";

    public static void main(String[] args) throws IOException {
        // #1
        printWritter(FILE_NAME_TO_WRITE);

        // #2
        printWritterWithTryCatchFinally(FILE_NAME_TO_WRITE);

        // #3
        printWritterWithTryWithResources(FILE_NAME_TO_WRITE);

        // #4
        readFileBufferedReader(FILE_NAME_TO_READ);

        // #5
        readFileScanner(FILE_NAME_TO_READ);

        // #6
        readFileFiles(FILE_NAME_TO_READ);

        // #7
        readFiles();

        // #8
        getWwwPage();
    }

    private static void printWritter(String fileNameToWrite) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(fileNameToWrite));
        printWriter.println("Hello World!");
        printWriter.close();
    }

    private static void printWritterWithTryCatchFinally(String fileNameToWrite) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(fileNameToWrite));
            printWriter.println("Hello World!");
        } catch (IOException e) {
            System.out.println("IOException!");
        } finally {
            if (null != printWriter) {
                printWriter.close();
            }
        }
    }

    private static void printWritterWithTryWithResources(String fileNameToWrite) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileNameToWrite))) {
            printWriter.println("Hello World!");
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    private static void readFileBufferedReader(String fileNameToRead) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNameToRead))) {
            String line;
            do {
                line = bufferedReader.readLine();
                System.out.println(line);
            } while (null != line);
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    private static void readFileScanner(String fileNameToRead) {
        try (Scanner scanner = new Scanner(new File(fileNameToRead))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    private static void readFileFiles(String fileNameToRead) {
        try (Stream<String> stream = Files.lines(Paths.get(fileNameToRead))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    private static void readFiles() throws IOException {
        Files.list(new File(".").toPath()).forEach(System.out::println);
    }

    private static void getWwwPage() throws IOException {
        URL page = new URL("http://sdacademy.pl");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(page.openStream()))) {
            bufferedReader.lines().forEach(System.out::println);
        }
    }
}
