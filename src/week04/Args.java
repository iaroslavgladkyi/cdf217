package week04;

/**
 * Created by codefire on 25.02.17.
 */
public class Args {
    public static void main(String[] args) {
        printArgs(args); // FIXED, DO NOT TOUC THIS LINE!!!
    }

    private static void printArgs(String[] args) {
        System.out.print(args[1] + ", ");
        System.out.print(args[0]);
    }
}
