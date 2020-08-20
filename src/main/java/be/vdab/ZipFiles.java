package be.vdab;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFiles {

    public static void main(String[] args) {

        try(ZipOutputStream zipStream = new ZipOutputStream(new FileOutputStream("archive.zip"));
            PrintStream streamWriter = new PrintStream(zipStream)) {
            // File one
            ZipEntry entryOne = new ZipEntry("file-one.txt");
            zipStream.putNextEntry(entryOne);
            streamWriter.println("Contents of file one"); // Write output using any stream (here PrintStream)
            // File two
            ZipEntry entryTwo = new ZipEntry("file-two.txt");
            zipStream.putNextEntry(entryTwo);
            streamWriter.println("Contents of file two");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
