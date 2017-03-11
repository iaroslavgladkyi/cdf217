package week04;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by codefire on 25.02.17.
 */
public class ExceptionHandling {

    private static final Logger log = Logger.getLogger(ExceptionHandling.class.getName());

    static {
        log.setLevel(Level.WARNING);
    }

    public static void main(String[] args) {
        int a = 10, b = args.length;
        try {
            anotherMethod();
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            //System.out.println("error");
            log.log(Level.SEVERE, "errror");
        }
        //System.out.println("important message!");
        log.log(Level.INFO, "important info message!");
    }

    private static void anotherMethod() {
        log.log(Level.INFO, "doing GC...");
        System.gc();
    }
}
