package plf.io.b_character_streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by codefire on 02.04.17.
 */
public class ReadFile {
    private static final int BUF_SZ = 3; // should be 4096

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Reader reader = new FileReader(WriteFile.FILE_NAME)) {
            char[] buf = new char[BUF_SZ];
            int count;
            while ( (count = reader.read(buf)) > 0) { // .read() вернет -1 если файл кончился
                stringBuilder.append(buf, 0, count);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не получилось открыть файл " + WriteFile.FILE_NAME);
        } catch (IOException e) {
            System.out.println("Не получилось прочитать файл " + WriteFile.FILE_NAME);
        }

        String text = stringBuilder.toString();
        System.out.printf("Text: %s%n", text);
    }
}
