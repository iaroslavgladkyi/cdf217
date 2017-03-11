package week03;

/**
 * Created by codefire on 19.02.17.
 */
public class Methods1 {
    // methods call sequence and debugging with Step Over / Step Into
    public static void main(String[] args) {
        System.out.println("main start");
        m1();
        System.out.println("main end");
    }

    protected static void m1() {
        System.out.println("m1");
        m2();
    }

    private static void m2() {
        System.out.println("m2");
    }
}
