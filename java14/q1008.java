import java.io.IOException;
import java.util.Scanner;

public class q1008 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int horas = leitor.nextInt();
        float valorPhora = leitor.nextFloat();
        float salario = horas * valorPhora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        leitor.close();
    }
}
