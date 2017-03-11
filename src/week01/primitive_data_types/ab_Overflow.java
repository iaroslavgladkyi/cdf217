package week01.primitive_data_types;

/**
 * Created by codefire on 19.02.17.
 */
public class ab_Overflow {
    public static void main(String[] args) {
        byte b = 127;
        b++;
        b++;
        System.out.println(b);
    }
}
