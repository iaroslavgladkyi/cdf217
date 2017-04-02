package plf.io.a_byte_streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Created by codefire on 02.04.17.
 */
public class WriteFile {
    public static void main(String[] args) throws IOException {
        System.out.print("Text: ");
        String userInput = new Scanner(System.in).nextLine();
        byte[] bytes = userInput.getBytes();

        OutputStream os = new FileOutputStream("out/io.bin");
        os.write(bytes);
        os.close();
    }
}
