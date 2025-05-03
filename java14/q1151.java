import java.io.IOException;
import java.util.Scanner;

public class q1151 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int anterior = 0;
        int corrente = 1;

        for (int i = 1; i <= n; i++) {
            if (i == n)
                System.out.println(anterior);
            else
                System.out.print(anterior + " ");
            int proximo = anterior + corrente;
            anterior = corrente;
            corrente = proximo;
        }

        leitor.close();
    }
}