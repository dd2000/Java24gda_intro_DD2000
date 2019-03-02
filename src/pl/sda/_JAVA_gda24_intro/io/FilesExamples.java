package pl.sda._JAVA_gda24_intro.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExamples {
    public static void main(String[] args) {
        //base path
        Path baseFolder = Paths.get(".");
        System.out.println("my base path is: " + baseFolder.toAbsolutePath());

        //path, absolute path, canonical path
        System.out.println("---------------------------------");
        Path relativePath = Paths.get("./src/../src/pl/sda/./io/read-file-example.txt");
        System.out.println("relativePath.toString() = " + relativePath.toString());
        System.out.println("relativePath.toAbsolutePath() = " + relativePath.toAbsolutePath());
        try {
            System.out.println("relativePath.toRealPath() = " + relativePath.toRealPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //creating new file
        System.out.println("---------------------------------");
        Path folder = Paths.get("C:\\test");
        Path file = folder.resolve("hello.txt");
        System.out.println("file = " + file);
        System.out.println("file exists = " + Files.exists(file));

        Path parentFile = file.getParent();

        System.out.println("parentFile exists = " + Files.exists(parentFile));
        try {
            Files.createDirectories(parentFile);
            Files.createFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("parentFile exists = " + Files.exists(parentFile));
        System.out.println("file exists = " + Files.exists(file));

        //creating new subfolder
        Path subfolder = parentFile.resolve("subfolder");
        Path file2 = subfolder.resolve("hello2.txt");
        try {
            Files.createDirectory(subfolder);
            Files.createFile(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("subfolder exists = " + Files.exists(parentFile));
        System.out.println("file2 exists = " + Files.exists(file2));

        //move file
        System.out.println("---------------------------------");
        Path renamedFile = subfolder.resolve("hello3.txt");
        Path copyFile = parentFile.resolve("hello5.txt");
        try {
            Files.copy(file, copyFile);
            Files.move(file, renamedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("old path = " + file);
        System.out.println("copied path = " + copyFile);
        System.out.println("new path = " + renamedFile);

        //list all files and folders
        System.out.println("---------------------------------");
        listFiles(parentFile);

        //delete all files and folders
        System.out.println("---------------------------------");
        deleteFiles(parentFile);
    }

    private static void listFiles(Path path) {
        try {
            if (Files.isDirectory(path)) {
                System.out.println("folder = " + path);
                try(DirectoryStream<Path> paths = Files.newDirectoryStream(path)) { //DirectoryStream should be closed at the end!
                    for (Path innerPath : paths) {
                        listFiles(innerPath);
                    }
                }
            } else if (Files.isRegularFile(path)) {
                System.out.println("file = " + path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteFiles(Path path) {
        try {
            if (Files.isDirectory(path)) {
                try(DirectoryStream<Path> paths = Files.newDirectoryStream(path)) {
                    for (Path innerPath : paths) {
                        deleteFiles(innerPath);
                    }
                }
            }

            boolean deleted = Files.deleteIfExists(path);
            System.out.printf("file/folder: %s deleted: %s\n", path, deleted);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
