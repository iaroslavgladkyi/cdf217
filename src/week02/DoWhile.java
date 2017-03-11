package week02;

/**
 * Created by codefire on 18.02.17.
 */
public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
         do {
             if (i == 2) {
                 i++;
                 continue;
             }
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}

