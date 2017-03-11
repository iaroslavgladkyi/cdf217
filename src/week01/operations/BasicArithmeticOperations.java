package week01.operations;

/**
 * Created by codefire on 19.02.17.
 */
public class BasicArithmeticOperations {

    // addition, subtraction, multiplication, division, increment, decrement
    public static void main0(String[] args) {
        int a = 35;
        int b = a + 1;
        int c;
        c = a;
        c = c + 1; // 36
        c--; // 35
        c += 1; // equivalent to 'c = c + 1;'
        a *= 2;
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }

    // mod vs. division
    public static void main(String[] args) {
        double a = 5.0;
        a = a % 2.0;
        System.out.printf("a = %g%n", a);
        a = 5.0 / 2;
        System.out.printf("a = %g%n", a);
    }
}
