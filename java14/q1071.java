import java.util.Scanner;

public class q1071 {
    public static void main(String[] args) {
        int X, Y, total = 0;
        Scanner leitor = new Scanner(System.in);
        X = leitor.nextInt();
        Y = leitor.nextInt();

        if (X > Y) {
            for (int i = X - 1; i > Y; i--) {
                if (i % 2 != 0) {
                    total += i;
                }
            }
        } else {
            for (int i = Y - 1; i > X; i--) {
                if (i % 2 != 0) {
                    total += i;
                }
            }
        }

        System.out.printf(total + "\n");

        leitor.close();
    }
}
