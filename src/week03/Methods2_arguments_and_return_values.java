package week03;

/**
 * Created by codefire on 19.02.17.
 */
public class Methods2_arguments_and_return_values {
    public static void main(String[] args) {
        int x = 4;
        int y = print(x);
        //System.out.println(y);
    }

    private static int print(int x) {
        double root = Math.sqrt(x);
        int result = (int) root;
        return result;
    }
}
