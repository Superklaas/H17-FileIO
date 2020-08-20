package be.vdab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Listing1215_Scanner {
    public static void main(String[] args) throws FileNotFoundException {

        try (Scanner scanner1 = new Scanner(new File("testje.txt"));) {
            while (scanner1.hasNext()) {
                String firstName = scanner1.next();
                String middleName = scanner1.next();
                String lastName = scanner1.next();
                int score = scanner1.nextInt();
                System.out.println(firstName + " " + middleName + " " + lastName + " " + score);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        Scanner scanner2 = new Scanner(new File("test2.rtf"));
        String intValue = scanner2.next();
        String line = scanner2.nextLine();
        System.out.println("intValue: " + intValue);
        System.out.println("line: " + line);

    }
}
