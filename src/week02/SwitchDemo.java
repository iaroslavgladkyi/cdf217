package week02;

import java.util.Scanner;

/**
 * Created by codefire on 12.02.17.*
 */
public class SwitchDemo {
    public static void main(String[] args) {
        // First, we wrote 'switch' case, then the same alg.using if

        //controlFlowUsing_if();
        //controlFlowUsing_switch();
    }

    private static void controlFlowUsing_if() {
        byte x = new Scanner(System.in).nextByte(); // -128..127 | 12, 0
        if (x != 0 && x != 12) {
            System.out.println("def");
        } else if (x == 12) {
            System.out.println("a");
            x = 0; //  coz 'break' in the switch below is commented out
        }
        if (x == 0) {
            System.out.println(123);
            int e = 123 + 90;
            System.out.println("e = " + 123);
        }
    }

    private static void controlFlowUsing_switch() {
        byte x = new Scanner(System.in).nextByte(); // -128..127 | 12, 0
        switch (x) {  // type <int+Wrappers  + String  + enum
            default:
                System.out.println("def");
                break;
            case 12:
                System.out.println("a");
                //break;
            case 0:
                System.out.println(123);
                int e = 123 + 90;
                System.out.println("e = " + 123);
                //break;
        }
    }
}
