import java.util.Scanner;

public class q1075 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % x == 2) {
                System.out.printf(i + "\n");
            }

        }
        leitor.close();
    }
}
