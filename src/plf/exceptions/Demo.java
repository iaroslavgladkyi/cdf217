package plf.exceptions;

import java.io.File;
import java.io.IOException;

/**
 * Created by codefire on 26.03.17.
 */
public class Demo {

    private static int x = 1, y;

    public static void main(String[] args) throws IOException {
        divide();

        try {
            divide();
        } catch (IOException | ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("<IT VERY IMPORTANT MESSAGE>");
    }

    private static void divide() throws IOException /*RuntimeException*/ {
        File f = null;
        try {
            f = File.createTempFile("asdf", "asdf");
            // ... work
            // .. with file ...

            // generating exception
            int a = x / y;
            System.out.println(a); //"java.lang.ArithmeticException" will be outputted
            // ...
        } finally {
            if (f != null) f.delete();
        }

        /*try {
            // создает временный файл
            File f = File.createTempFile("asdf", "asdf");
        } catch (java.io.IOException e) {
            System.out.println("Не удалось создать временный файл");
        }*/

        int a = x / y;
        System.out.println(a); //"java.lang.ArithmeticException" will be outputted
    }
}
