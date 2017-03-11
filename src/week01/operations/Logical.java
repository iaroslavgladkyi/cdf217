package week01.operations;

/**
 * Created by codefire on 19.02.17.
 */
public class Logical {

    // >,  <,  >=,  <=  operands: any types    result: boolean
    // ==, !=           operands: any types    result: boolean
    // &&, ||, !        operands: booleans     result: boolean
    public static void main(String[] args) {
        //   int int => boolean
        //    1 > 5
        int a = 1, b = 2;
        boolean b1 = !(a != b);  // f
        boolean b2 = !true; // f
        System.out.println(b1 || b2); // f
    }
}
