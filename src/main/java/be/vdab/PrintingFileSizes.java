package be.vdab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintingFileSizes {
    public static void main(String[] args) throws IOException {

        //Path path1 = Paths.get("Fawlty.jpg");
        File images = new File("Images");

        System.out.println(images.exists());
        File[] imagesArray = images.listFiles();
        for (File image : imagesArray) {
            System.out.print(image.getName() + ": ");
            System.out.printf("%5.2f KB (size), ", (double)image.length()/1000);
            System.out.print(Files.getOwner(image.toPath()) + " (owner)");
            System.out.println();
        }


    }
}
