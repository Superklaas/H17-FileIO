package be.vdab;

import java.io.IOException;

public class StandardStreams {
    public static void main(String[] args) throws IOException {
        System.out.print("Please enter a sentence: ");
        byte sentence[] = new byte[200];
        int size = System.in.read(sentence);
        System.out.write(sentence, 0, size);
        System.err.println("This concludes our demonstration.");
    }
}
