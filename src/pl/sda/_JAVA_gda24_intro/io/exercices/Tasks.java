package pl.sda._JAVA_gda24_intro.io.exercices;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Tasks {
    private static final Path TEST_FOLDER = Paths.get("C:/workspace/io_test");

    public static void main(String[] args) {
        //#1
        createTestFolders();

        //#2
        //listFoldersAndFiles();

        //#3
        //deleteFiles();

        //#4
        //writeAndReadWithFiles();

        //#5
        //writeAndReadObjectsWithFiles();
    }

    /**
     * 1. Stwórz katalog testowy do ćwiczeń z systemem plików.
     * Wybierz katalog główny i stwórz w nim 3 foldery (A, B, C) i pliki (I.txt, II.txt)
     * W folderze A dodaj dwa podfoldery: A1 i A2.
     * Przenieś plik I.txt do folderu B
     * Skopiuj plik II.txt do folderów: A, A2, B i C
     */
    private static void createTestFolders() {
    }

    /**
     * 2. Wypisz na konsolę ścieżki do wszystkich folderów i podfolderów z katalogu testowego
     * Następnie wypisz wszystkie pliki znajdujące się w folderze B
     */
    private static void listFoldersAndFiles() {
    }

    /**
     * 3. Usuń katalog C z katalogu bazowego
     */
    private static void deleteFiles() {
    }

    /**
     * 4. Zapisz kilka linijek tekstu do pliku A/II.txt
     * Następnie odczytaj tekst i wyświetl w konsoli.
     */
    private static void writeAndReadWithFiles() {
    }

    /**
     * 5. Utwórz obiekt klasy Student.
     * Zapisz wartości pól ze stworzonego obiektu do pliku: {nazwa_studenta}.txt znajdującego się w folderze A/A1
     * Następnie odczytaj wartości z pliku i na ich podstawie stwórz nowy obiekt klasy Student.
     */
    private static void writeAndReadObjectsWithFiles() {
    }
}
