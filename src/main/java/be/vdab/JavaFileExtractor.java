package be.vdab;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class JavaFileExtractor extends SimpleFileVisitor<Path> {

    public final List<Path> basket = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        JavaFileExtractor v = new JavaFileExtractor();
        Files.walkFileTree(Paths.get("."), v); // Start at current directory
        for (int i = 0; i < v.basket.size(); i++) {
            System.out.println(v.basket.get(i));
        }
    }

    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        if(dir.getFileName().equals(Paths.get("target"))) {
            return FileVisitResult.SKIP_SUBTREE; // Skip target (build) folder
        }
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws
            IOException {
        if(file.getFileName().toString().endsWith(".java")) {
            basket.add(file);
        }
        return FileVisitResult.CONTINUE;
    }
}
