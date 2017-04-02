package plf.io.b_character_streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * Created by codefire on 02.04.17.
 */
public class WriteFile {
    public static final String FILE_NAME = "out/io.txt";

    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            System.out.print("Text: ");
            writer.write(new Scanner(System.in).nextLine());
        }
    }
}
