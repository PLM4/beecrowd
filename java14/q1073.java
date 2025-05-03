import java.util.Scanner;

public class q1073 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        for (int i = 2; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + "^2 = " + i * i + "\n");
            }

        }
        leitor.close();
    }
}