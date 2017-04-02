package plf.io.a_byte_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by codefire on 02.04.17.
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "out/io.bin";
        final int BUFFER_SIZE = 100;

        InputStream is = new FileInputStream(FILE_NAME);
        byte[] bytes = new byte[BUFFER_SIZE];
        int k = is.read(bytes);
        String string = new String(bytes, 0, k);
        System.out.println("Text: " + string);
    }
}
