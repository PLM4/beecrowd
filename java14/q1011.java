import java.io.IOException;
import java.util.Scanner;

public class q1011 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double raio = leitor.nextDouble();

        double total = Math.pow(raio, 3) * (4 / 3.0) * (3.14159);

        System.out.printf("VOLUME = %.3f%n", total);

        leitor.close();
    }
}
