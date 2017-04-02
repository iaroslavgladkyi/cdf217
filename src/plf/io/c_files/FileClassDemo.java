package plf.io.c_files;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * Created by codefire on 02.04.17.
 */
public class FileClassDemo {
    public static void main(String[] args) {
        File file = new File("out/io.bin");
        System.out.printf("exists: %b%n", file.exists());
        System.out.printf("canRead: %b%n", file.canRead());
        System.out.printf("canWrite: %b%n", file.canWrite());
        System.out.printf("canExecute: %b%n", file.canExecute()); // sudo chmod u=rwx io.bin
        System.out.println("----------------------------------");
        System.out.printf("length: %d%n", file.length());
        System.out.printf("AbsolutePath: %s%n", file.getAbsolutePath());
        // Time API (Java 8)
        long epochMilli = file.lastModified();
        String string = Instant.ofEpochMilli(epochMilli).atZone(ZoneId.of("UTC+3")).toString();
        // Java 1.0
        string = new Date(epochMilli).toString();
        System.out.printf("last modified: %s%n", string);

        System.out.println(file.getParentFile());
        String[] names = file.getParentFile().list();
        for (String name : names) {
            System.out.println("\t" + name);
        }
    }
}
