package be.vdab;

import java.io.File;

public class DeleteTxt {

    public static void main(String[] args) {
        deleteImages(new File("."));
    }

    public static void deleteImages(File file) {
        if(file.isDirectory()) {
            File[] children = file.listFiles();
            if(children != null) {
                for (File child : children) {
                    deleteImages(child);
                }
            }
        } else if(file.isFile() && file.getName().endsWith(".txt")) {
            System.out.printf("Deleting file '%s'", file.getPath());
            file.delete();
        }
    }
}
