import java.io.IOException;
import java.util.Scanner;

public class q1004 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        int PROD = a * b;

        System.out.println("PROD = " + PROD);

        leitor.close();
    }
}
