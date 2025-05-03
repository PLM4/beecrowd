import java.io.IOException;
import java.util.Scanner;

public class q1006 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Double a = leitor.nextDouble();
        Double b = leitor.nextDouble();
        Double c = leitor.nextDouble();

        Double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f%n", media);

        leitor.close();

    }
}
