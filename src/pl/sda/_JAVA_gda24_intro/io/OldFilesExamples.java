package pl.sda._JAVA_gda24_intro.io;

import java.io.File;
import java.io.IOException;

public class OldFilesExamples {
    public static void main(String[] args) {
        //base path
        // . - current folder
        // .. - parent folder
        File basePath = new File(".");
        System.out.println("my base path is: " + basePath.getAbsolutePath());

        //path, absolute path, canonical path
        System.out.println("---------------------------------");
        File relativePath = new File("../temp/folder1/../folder2/./hello.txt");
        System.out.println("relativePath.getPath() = " + relativePath.getPath());
        System.out.println("relativePath.getAbsolutePath() = " + relativePath.getAbsolutePath());
        try {
            System.out.println("relativePath.getCanonicalPath() = " + relativePath.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //creating new file
        System.out.println("---------------------------------");
        File file = new File("C:\\test\\hello.txt");

        System.out.println("file.exists() = " + file.exists());
        File parentFile = file.getParentFile();

        System.out.println("parentFile.exists() = " + parentFile.exists());
        boolean success = parentFile.mkdirs();
        System.out.println("parentFile.mkdirs() = " + success);
        System.out.println("parentFile.exists() = " + parentFile.exists());

        try {
            success = file.createNewFile();
            System.out.println("file.createNewFile() = " + success);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file.exists() = " + file.exists());

        //creating new subfolder
        File subfolder = new File(parentFile, "subfolder");
        success = subfolder.mkdir();
        System.out.println("subfolder.mkdirs() = " + success);
        System.out.println("subfolder.exists() = " + subfolder.exists());

        //creating new file in subfolder
        File file2 = new File(subfolder, "hello2.txt");
        try {
            success = file2.createNewFile();
            System.out.println("file2.createNewFile() = " + success);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //move file
        System.out.println("---------------------------------");
        File renamedFile = new File(subfolder, "hello3.txt");
        success = file.renameTo(renamedFile);
        System.out.println("old path = " + file);
        System.out.println("new path = " + renamedFile);
        System.out.println("file.renameTo() = " + success);

        //list all files and folders
        System.out.println("---------------------------------");
        File[] files = parentFile.listFiles();
        listFiles(files);

        //delete all files and folders
        System.out.println("---------------------------------");
        deleteFiles(parentFile);

    }

    private static void listFiles(File[] files) {
        if(files == null) {
            return;
        }

        for (File file : files) {
            if(file.isDirectory()) {
                System.out.println("folder = " + file.getPath());
                listFiles(file.listFiles());
            } else if(file.isFile()) {
                System.out.println("file = " + file.getPath());
            }
        }
    }

    private static void deleteFiles(File parentFile) {
        if(parentFile.isDirectory()) {
            for (File file : parentFile.listFiles()) {
                deleteFiles(file);
            }
        }

        boolean deleted = parentFile.delete();
        System.out.printf("file/folder: %s deleted: %s\n", parentFile, deleted);
    }
}
