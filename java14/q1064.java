import java.io.IOException;
import java.util.Scanner;

public class q1064 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double x;
        int count = 0;
        double soma = 0.0;
        for (float i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if (x > 0) {
                soma += x;
                count += 1;
            }
        }
        soma = soma / count;
        System.out.printf(count + " valores positivos\n");
        System.out.printf("%.1f%n", soma);

        leitor.close();
    }
}
