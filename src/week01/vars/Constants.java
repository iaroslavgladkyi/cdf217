package week01.vars;

/**
 * Created by codefire on 25.02.17.
 */
public class Constants {
    public static void main(String[] args) {
        final float PI = 3.14152549F;
        //...
        //...
        //PI++; CTE: Error:(11, 9) java: cannot assign a value to final variable PI
        //...

        System.out.println(PI);
        System.out.println(1/0); // RTE
    }
}
