package be.vdab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Listing1213_PrintWriter {
    public static void main(String[] args) throws FileNotFoundException {

        // create File object and check existence
        File file = new File("test.txt");
       /* if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        } */

        // create PrintWriter object for the File object
        PrintWriter printWriter = new PrintWriter(file);

        // write data to file through PrintWriter object
        printWriter.print("Ping Pong Bal ");
        printWriter.println(20);
        printWriter.print("Wang Snee Wang ");
        printWriter.println(15);
        /*double number = 5;
        printWriter.printf("The number is %3.2f", number);*/
        printWriter.close();

    }
}
