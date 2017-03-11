package week02;

/**
 * Created by codefire on 12.02.17.
 */
public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i++);
            System.out.println("("+i+" < 5) = " + (i < 5));
            //break;
        }
        System.out.println("-----------------------------------");
        System.out.println("i = " + i);
        System.out.println("(i < 5) = " + (i < 5));
        ///...
    }
}
