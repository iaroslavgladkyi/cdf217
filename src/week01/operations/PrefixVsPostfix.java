package week01.operations;

/**
 * Created by codefire on 19.02.17.
 */
public class PrefixVsPostfix {
    public static void main(String[] args) {
        int a = 1, b = ++a, c = a--;
        System.out.println(a); //1
        System.out.println(b); //2
        System.out.println(c); //2
    }
}
