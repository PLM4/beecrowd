import java.io.IOException;
import java.util.Scanner;

public class q1067 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        leitor.close();
    }
}
