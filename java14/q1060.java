import java.io.IOException;
import java.util.Scanner;

public class q1060 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double x;
        int count = 0;

        for (float i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if (x > 0) {
                count += 1;
            }
        }
        System.out.print(count + " valores positivos\n");

        leitor.close();
    }
}
