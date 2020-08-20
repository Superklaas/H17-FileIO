package be.vdab;

import java.io.File;

public class DeleteDest {

    public static void main(String[] args) {
        System.out.println();
        File file = new File(".");
        deleteDest(file);
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

    public static void deleteDest(File file) {
        File[] fileList = file.listFiles();
        for (File f : fileList) {
            if (f.getName().startsWith("dest")) {
                f.delete();
            }
        }
        for (File f : fileList) {
            System.out.println(f.getName());
        }
    }

}
