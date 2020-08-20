package be.vdab;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;

public class CopyingFiles {
    public static void main(String[] args) throws IOException {

        // GOOD EXERCISE, BUT TROUBLE WITH MOVING FILES TO ANOTHER DIRECTORY
        // Files.copy? Files.move?

        File images = new File("Images");
        System.out.println(images.exists());
        System.out.println(images.isDirectory());

        System.out.println();
        File imagesBis = new File("Images");
        System.out.println(imagesBis.exists());
        System.out.println(imagesBis.isDirectory());

        /*System.out.println();
        Files.copy(images.toPath(),imagesBis.toPath());*/

        System.out.println();
        File[] imagesArray = images.listFiles();
        //Files.copy(imagesArray[0].toPath(),imagesBis.toPath());
        for (File image : imagesArray) {
            Files.move(image.toPath(),imagesBis.toPath());
        }

    }
}
