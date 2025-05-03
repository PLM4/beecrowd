import java.io.IOException;
import java.util.Scanner;

public class q1048 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double salario = leitor.nextDouble();
        double nSalario = 0.0;

        if (salario > 0 && salario <= 400.00) {
            nSalario = salario + (salario * 0.15);
            System.out.printf("Novo salario: %.2f%n", nSalario);
            System.out.printf("Reajuste ganho: %.2f%n", salario * 0.15);
            System.out.println("Em percentual: 15 %");
        } else if (salario >= 400.01 && salario <= 800.00) {
            nSalario = salario + (salario * 0.12);
            System.out.printf("Novo salario: %.2f%n", nSalario);
            System.out.printf("Reajuste ganho: %.2f%n", salario * 0.12);
            System.out.println("Em percentual: 12 %");
        } else if (salario >= 800.01 && salario <= 1200.00) {
            nSalario = salario + (salario * 0.10);
            System.out.printf("Novo salario: %.2f%n", nSalario);
            System.out.printf("Reajuste ganho: %.2f%n", salario * 0.10);
            System.out.println("Em percentual: 10 %");
        } else if (salario > 1200.01 && salario <= 2000.00) {
            nSalario = salario + (salario * 0.07);
            System.out.printf("Novo salario: %.2f%n", nSalario);
            System.out.printf("Reajuste ganho: %.2f%n", salario * 0.07);
            System.out.println("Em percentual: 7 %");
        } else if (salario > 2000.00) {
            nSalario = salario + (salario * 0.04);
            System.out.printf("Novo salario: %.2f%n", nSalario);
            System.out.printf("Reajuste ganho: %.2f%n", salario * 0.04);
            System.out.println("Em percentual: 4 %");
        }

        leitor.close();
    }
}
