import java.io.IOException;
import java.util.Scanner;

public class q1005 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Double a = leitor.nextDouble();
        Double b = leitor.nextDouble();

        Double media = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f%n", media);

        leitor.close();
    }
}
