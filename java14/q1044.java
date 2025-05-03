import java.io.IOException;
import java.util.Scanner;

public class q1044 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        leitor.close();
    }
}
