package be.vdab;

import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {

    public static void main(String[] args) throws IOException {

        File file1 = new File("/Users/klaasdc/IntelliJ IDEA/H17 FileIO/alice.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.getName());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.createNewFile());
        System.out.println("getAbsolutePath " + file1.getAbsolutePath());
        System.out.println("getPath " + file1.getPath());
        System.out.println("getParent " + file1.getParent());
        System.out.println("getParentFile " + file1.getParentFile());
        Date date = new Date(file1.lastModified());
        System.out.println("lastModified " + date.toString());
        System.out.println("renameTo " + file1.renameTo(new File("dest.txt")));

        System.out.println();
        File file2 = new File(".");
        File[] file2List = file2.listFiles();
        for (File file : file2List) {
            System.out.println(file.getName());
        }

        System.out.println();
        File file3 = new File("test.txt");
        System.out.println(file3.exists());
        System.out.println(file1.renameTo(file3));

    }
}
