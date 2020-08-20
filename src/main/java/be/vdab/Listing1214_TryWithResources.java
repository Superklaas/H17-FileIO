package be.vdab;

import java.io.*;

public class Listing1214_TryWithResources {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test1.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        } 
        try(PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print("Klaas ");
            printWriter.println(20);
            double number = 5;
            printWriter.printf("The number is %3.2f", number);
        }
    }
}
