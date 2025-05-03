import java.util.Scanner;

public class q1080 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maior = 0, posicao = 0;
        for (int i = 1; i <= 100; i++) {
            int num = leitor.nextInt();
            if (maior > num) {
                maior = maior;
                posicao = posicao;
            } else {
                posicao = i;
                maior = num;
            }
        }
        System.out.print(maior + "\n" + posicao + "\n");
        leitor.close();
    }
}
