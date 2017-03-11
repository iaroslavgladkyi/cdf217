import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Created by codefire on 04.03.17.
 */
public class GuessGame3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("\nЯ загадал новое число от 1 до 3");
            int b = (int) (Math.random() * 3);

            for (int i = 0; i < 2; i++) {
                System.out.println(" (attempt #" + (i + 1) + ")");
                String stroka = sc.nextLine();
                exitCheck(stroka);
                Integer a = parseInt(stroka);
                if (a == b) {
                    System.out.println("YES. YOU WIN");
                } else {
                    System.out.print("NO. ");
                    if (i == 0) {
                        System.out.println("Try again.");
                    } else {
                        System.out.println("You lose.");
                    }
                }
            }
        }
    }

    private static void exitCheck(String stroka) {
        if (stroka.equals("exit")) {
            System.out.println("Game Over");
            System.exit(0);
        }
    }
}