package week01.primitive_data_types;

/**
 * Created by codefire on 19.02.17.
 */
public class aa_Vars__real_floats_and_printf {
    public static void main(String[] args) {
        // 9.10938356 × 10-31 килограмма
        float electronMass = (float) 9.10938356e-31; // loosing ....56
        System.out.print(electronMass + " ");
        double em = electronMass;
        System.out.printf("%.50f", em);
        String s1 = "aa", s2 = "bb";
        System.out.printf("%ns1 = %s; s2 = %s%n", s1, s2);
    }
}
