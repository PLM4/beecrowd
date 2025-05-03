import java.io.IOException;
import java.util.Scanner;

public class q1010 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int quantos1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();
        int quantos2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();

        double total = (quantos1 * valor1) + (quantos2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        leitor.close();
    }
}
