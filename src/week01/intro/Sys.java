package week01.intro;

/**
 * Created by codefire on 19.02.17.
 */
public class Sys {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long bytes = rt.totalMemory() - rt.freeMemory();
        System.out.printf("%,d", bytes);
    }
}
