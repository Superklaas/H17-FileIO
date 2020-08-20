package be.vdab;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
    public static void main(String[] args) {

        Path path1 = Paths.get("alice.txt");
        System.out.format("toString: %s%n", path1.toString());
        System.out.format("getFileName: %s%n", path1.getFileName());
        System.out.format("getName(0): %s%n", path1.getName(0));
        System.out.format("getNameCount: %d%n", path1.getNameCount());
        //System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path1.getParent());
        System.out.format("getRoot: %s%n", path1.getRoot());

        System.out.println();
        Path path2 = Paths.get("test.txt");
        System.out.println("compareTo: " + path1.compareTo(path2));
        System.out.println("endsWith: " + path2.endsWith(".txt"));



    }
}
