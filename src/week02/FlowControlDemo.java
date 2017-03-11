package week02;

/**
 * Created by codefire on 11.02.17.
 */
public class FlowControlDemo {
    public static void main(String[] args) {
        int i = 100;
        boolean q = true;
        boolean b = ((i == 10 && !q) && q);

        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
