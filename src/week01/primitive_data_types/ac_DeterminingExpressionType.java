package week01.primitive_data_types;

/**
 * Created by codefire on 19.02.17.
 */
public class ac_DeterminingExpressionType {
    // String -> String
    // double -> float -> long -> int
    // boolean -> CTE
    public static void main(String[] args) {
        // a + b
        int a = 1, b = 2; // declaration of 'a' and 'b' variables
        short x = (short) (a + b);
        System.out.println(x);

        float o1 = 1;
        long o2 = 1;

        float result = o1 + o2;
    }
}
