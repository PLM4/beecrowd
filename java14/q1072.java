import java.util.Scanner;

public class q1072 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < x; i++) {
            int k = leitor.nextInt();
            if (k >= 10 && k <= 20)
                in++;
            else
                out++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        leitor.close();
    }
}