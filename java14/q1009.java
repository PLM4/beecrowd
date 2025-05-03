import java.io.IOException;
import java.util.Scanner;

public class q1009 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double salario = leitor.nextDouble();
        double vendas = leitor.nextDouble();
        double newSalario = (vendas * 0.15) + salario;

        System.out.printf("TOTAL = R$ %.2f%n", newSalario);

        leitor.close();
    }
}
