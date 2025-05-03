import java.util.Scanner;

public class q1078 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf(i + " x " + x + " = " + i * x + "\n");
        }
        leitor.close();
    }
}
