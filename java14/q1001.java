import java.io.IOException;
import java.util.Scanner;

public class q1001 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int x = a + b;
        System.out.println("X = " + x);

        leitor.close();
    }
}
