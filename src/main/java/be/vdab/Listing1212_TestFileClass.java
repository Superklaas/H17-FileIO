package be.vdab;

import java.io.*;
import java.util.Date;

public class Listing1212_TestFileClass {
    public static void main(String[] args) throws IOException {

        // absolute file name
        File file1 = new File(
                "/Users/klaasdc/IntelliJ IDEA/H17 FileIO/src/main/java/be/vdab/TestFile.java");
        System.out.println("Exists: " + file1.exists());
        System.out.println("Path: " + file1.getPath());
        System.out.println("Absolute path: " + file1.getAbsolutePath());
        System.out.println("Cannonical path: " + file1.getCanonicalPath());
        System.out.println("Length: " + file1.length() + " bytes");
        System.out.println("Readable: " + file1.canRead());
        System.out.println("Writable: " + file1.canWrite());
        System.out.println("Directory: " + file1.isDirectory());
        System.out.println("File: " + file1.isFile());
        System.out.println("Last modified: " + new Date(file1.lastModified()));

        // experiments with relative file name
        // Liang: "A relative file name is in relation to the current working directory. The complete
        // directory path for a relative file name is omitted."
        // Here: current working directory = H17 FileIO (see tab Project)

        // wrong relative file name --> should be written starting from src
        System.out.println();
        File file2 = new File("TestFile.java");
        System.out.println("Exists: " + file2.exists());
        System.out.println("Path: " + file2.getPath());
        System.out.println("Absolute path: " + file2.getAbsolutePath());
        System.out.println("Cannonical path: " + file2.getCanonicalPath());

        // correction on example above
        System.out.println();
        File file3 = new File("src/main/java/be/vdab/TestFile.java");
        System.out.println("Exists: " + file3.exists());
        System.out.println("Path: " + file3.getPath());
        System.out.println("Absolute path: " + file3.getAbsolutePath());
        System.out.println("Cannonical path: " + file3.getCanonicalPath());

        // txt file in current working directory
        System.out.println();
        File file4 = new File("dest.txt");
        System.out.println("Exists: " + file4.exists());
        System.out.println("Path: " + file4.getPath());
        System.out.println("Absolute path: " + file4.getAbsolutePath());
        System.out.println("Cannonical path: " + file4.getCanonicalPath());


    }
}

