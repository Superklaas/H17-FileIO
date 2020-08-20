package be.vdab;

import java.io.File;

public class DeleteZip {

    public static void main(String[] args) {
        System.out.println();
        File file = new File(".");
        deleteZip(file);
    }

    public static void deleteZip(File file) {
        File[] fileList = file.listFiles();
        for (File f : fileList) {
            if (f.getName().endsWith("zip")) {
                f.delete();
            }
        }
        for (File f : fileList) {
            System.out.println(f.getName());
        }
    }

}
