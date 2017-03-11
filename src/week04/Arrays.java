package week04;

/**
 * Created by codefire on 25.02.17.
 */
public class Arrays {
    public static void main(String[] args) {
        //randomCellFrom4();
        //initializedArray();
        //_2DCharArray();
        //jagged2DArrayOfString();


        _4D();
    }

    private static void _4D() {
        int[][][][] a = new int[4][2][3][3];
        //                      ^boxes
        //                         ^ tables
        //                            ^ rows
        //                                ^ columns
    }

    private static void jagged2DArrayOfString() {
        String[][] s = new String[2][];
        s[0] = new String[] {"aa", "bb", "cc"};
        s[1] = new String[] {"dd", "ee"};
        System.out.println(s[1][1]);
    }

    private static void _2DCharArray() {
        char d = 'D';
        char[][] table = {{'a', 'b'}, {'c', d}};

        System.out.print(table[0][0] + " " + table[0][1]);
        System.out.println();
        System.out.print(table[1][0] + " " + table[1][1]);
    }

    private static void initializedArray() {
        int[] a;
        a = new int[]{1, 2, 3, 4};
        System.out.println(a[0]); // 1
        System.out.println(a[1]); // 2
        System.out.println(a[2]); // 3
        System.out.println(a[3]); // 4

        System.out.println(a[4]); // java.lang.ArrayIndexOutOfBoundsException: 4
    }

    private static void randomCellFrom4() {
        // declaration
        int a0, a1, a2, a3;
        int[] a = new int[4];
        // working with
        a3 = 100;
        a[3] = 100;
        // System.out.println(a[3]);
        int i = (int) (Math.random() * 4); // [0..3]
        int result = a[i];
        System.out.println(result);
    }
}
