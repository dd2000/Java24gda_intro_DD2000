package pl.sda._JAVA_gda24_intro.io.exercices;

import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Samples {
    private static final String BASE_FOLDER_PATH = "C:\\workspace\\io_test";
    private static final Path BASE_PATH = Paths.get(BASE_FOLDER_PATH);

    public static void main(String[] args) {
        //#1
        //tworzenie ścieżek do plików i katalogów
        //createPaths();

        //#2
        //tworzenie katalogów i plików
        //createFoldersAndFiles();

        //#3
        //przenoszenie i kopiowanie plików
        //moveAndCopyFiles();

        //#4
        //wyświetlamy nazwy plików i katalogów
        //list();

        //#5
        //usuwamy pliki z katalogu
        //delete();

        //#6
        //piszemy i czytamy z pliku
        //writeAndReadFiles();

        //#7
        //piszemy i czytamy ze strumienia bajtów
        writeAndReadWithBytesStreams();

        //#8
        //analiza IO wystawionego przez klasę System + poznanie klasy Scanner
        //systemIOAndScanner();
    }

    private static void writeObjectsToFile() {

    }

    private static void createPaths() {
        //symbole w ścieżkach
        // / - główny katalog/partycja
        // . - aktualny folder
        // .. - folder-rodzic - jeden "krok" w górę ścieżki katalogów

        //aktualny katalog
        Path currentFolder = Paths.get(".");
        System.out.println("my current path is: " + currentFolder.toAbsolutePath());

        //tworzymy nową ścieżkę - do katalogu testowego
        Path basePath = BASE_PATH;
        System.out.println("basePath: " + basePath);

        //jak nie chcemy używać wprost seperatorów katalogów
        basePath = Paths.get("C:", "workspace", "io_test");
        System.out.println("basePath: " + basePath);

        //tworzymy ścieżkę na podstawie innej ścieżki
        Path pathToFile = basePath.resolve("test1.txt");
        System.out.println("pathToFile: " + pathToFile);
        Path pathToSubFolder = basePath.resolve("subfolder");
        System.out.println("pathToSubFolder: " + pathToSubFolder);

        Path relativePath = Paths.get("../subfolder2/./../subfolder/test2.txt");
        System.out.println("relativePath = " + relativePath);
        System.out.println("absolutePath = " + pathToSubFolder.resolve(relativePath).toAbsolutePath());
        try {
            System.out.println("realpath = " + relativePath.toRealPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFoldersAndFiles() {
        Path basePath = BASE_PATH;
        try {
            //tworzymy katalog na który wskazuje ścieżka - uwaga jak istnieje poleci wyjątek - dlatego sprawdzamy przez stworzeniem
            if(!Files.exists(basePath)) {
                Files.createDirectory(basePath);
            }

            Path subFolder = basePath.resolve("folder1/folder2/folder3");
            //tworzymy katalog i wszystkie nieistniejące nadkatalogi na które wskazuje ścieżka - tutaj nie poleci wyjątek jak katalog istnieje
            Files.createDirectories(subFolder);

            Path file = basePath.resolve("folderA/folderB/testC.txt");
            //tworzymy katalog-rodzic i wszystkie nieistniejące nadkatalogi
            Files.createDirectories(file.getParent());

            //tworzymy plik - jak istnieje poleci wyjątek
            if (!Files.exists(file)) {
                Files.createFile(file);
                System.out.println("file = " + file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void moveAndCopyFiles() {
        Path basePath = BASE_PATH;
        Path fileA = basePath.resolve("folderA/A.txt");
        Path fileB = basePath.resolve("folderB/B.txt");
        Path fileC = basePath.resolve("folderC").resolve(fileB.getFileName());

        try {
            Files.createDirectories(fileA.getParent());
            Files.createDirectories(fileB.getParent());
            Files.createDirectories(fileC.getParent());

            if (!Files.exists(fileA)) {
                Files.createFile(fileA);
                Files.write(fileA, "Hello A".getBytes());
            }

            //przenosimy plik, jak plik docelowy istnieje poleci wyjatek - dlatego dajemy opcję REPLACE_EXISTING
            Files.move(fileA, fileB, StandardCopyOption.REPLACE_EXISTING);

            //kopiujemy plik
            Files.copy(fileB, fileC, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void list() {
        //pobiera listę plików i folderów z aktualnego katalogu (nie zagłębia się w podkatalogi)
        try (Stream<Path> list = Files.list(BASE_PATH)) {
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------");

        //pobiera pełną listę plików i folderów z aktualnego katalogu (zagłębia się w podkatalogi)
        try (Stream<Path> list = Files.walk(BASE_PATH)) {
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void delete() {
        delete(BASE_PATH);
    }

    private static void delete(Path pathToDelete) {
        //iterujemy się po wszystkich elementach w katalogu:
        //pliki usuwamy
        //katalogi czyścimy(rekursywnie) i usuwamy
        try (Stream<Path> list = Files.list(pathToDelete)) {
            List<Path> paths = list.collect(Collectors.toList());
            for (Path path : paths) {
                if (Files.isRegularFile(path)) {
                    Files.delete(path);
                } else if (Files.isDirectory(path)) {
                    //wywołanie rekursywne (zagnieżdżone)
                    delete(path);
                    Files.delete(path);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeAndReadFiles() {
        Path fileA = BASE_PATH.resolve("A.txt");
        Path fileB = BASE_PATH.resolve("B.txt");
        Path fileC = BASE_PATH.resolve("C.txt");

        //FileWriter z buforem - wydajniejsze rozwiązanie
        //koniecznie zamykamy po użyciu! - najlepiej z try-with-resource
        try (FileWriter fileWriter = new FileWriter(fileA.toString());
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            //char c = 'A';
            //fileWriter.write(c);
            bufferedWriter.write("Hello World! Wiadomość z polskimi znakami: ąśćńłó");

        } catch (IOException e) {
            e.printStackTrace();
        }

        //FileReader z buforem - wydajniejsze rozwiązanie
        //koniecznie zamykamy po użyciu! - najlepiej z try-with-resource
        try (FileReader fileReader = new FileReader(fileA.toString());
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();
            System.out.println("line = " + line);
            line = bufferedReader.readLine();
            System.out.println("line = " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //można krócej - klasa Files udostępnia metodę do tworzenia BufferedWriter
        try (BufferedWriter writer = Files.newBufferedWriter(fileB)) {

            writer.write("Hello World!\nWiadomość z polskimi znakami: ąśćńłó");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //można krócej - klasa Files udostępnia metodę do tworzenia BufferedReader
        try (BufferedReader reader = Files.newBufferedReader(fileB)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("line = " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //PrintWriter to ta sama klasa którą używamy przy System.out.println();
        try (PrintWriter printWriter = new PrintWriter(fileC.toString())) {
            printWriter.println("Pierwsza linia");
            printWriter.println("Druga linia");
            printWriter.printf("Linia z bajerami: %.2f %s %TA%n", 12.5678, "Ala", LocalDate.now());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeAndReadWithBytesStreams() {
        Path fileA = BASE_PATH.resolve("A.txt");
        Path fileB = BASE_PATH.resolve("B.txt");

        byte[] bytes = "Hello SDA".getBytes();

        //zwykły strumień bajtów do zapisu
        //z buforem - wydajniejszy
        try (OutputStream outputStream = new FileOutputStream(fileA.toFile());
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {
             bufferedOutputStream.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //zwykły strumień bajtów z którego można czytać
        //z buforem - wydajniejszy
        try (InputStream inputStream = new FileInputStream(fileA.toFile());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            int c;
            while ((c = bufferedInputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        //klasa Files udostępnia metodę do tworzenia OutputStream z pliku
        try (OutputStream outputStream = Files.newOutputStream(fileB)) {
            outputStream.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //klasa Files udostępnia metodę do tworzenia InputStream z pliku
        try (InputStream inputStream = Files.newInputStream(fileB)) {
            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //pobieramy obrazek z Internetu
        Path pathToImage = BASE_PATH.resolve("vacancies.png");
        try (InputStream inputStream = new URL("https://sdacademy.pl/wp-content/themes/sdacademy/img/vacancies.png").openStream();
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(pathToImage.toString()))) {
            int c;
            while ((c = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void systemIOAndScanner() {
        //Klasa System wystawia trzy strumienie danych: jeden do odczytu i dwa do zapisu
        InputStream in = System.in;
        PrintStream out = System.out;
        PrintStream error = System.err;

        //przykład użycia "ręcznego"
        try {
            int read;
            while((read = in.read()) != '!') {
                out.print(read);
                out.print(" ");
                error.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //przykład użycia z pomocą klasy Scanner
        Scanner scanner = new Scanner(in);
        while(scanner.hasNext()) {
            String next = scanner.next();
            if("!".equals(next)) {
                break;
            }
            out.println(next);
            error.println(next);
        }
    }
}
