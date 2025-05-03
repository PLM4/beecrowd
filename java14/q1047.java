import java.io.IOException;
import java.util.Scanner;

public class q1047 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int inicio1 = leitor.nextInt();
        int inicio2 = leitor.nextInt();
        int final1 = leitor.nextInt();
        int final2 = leitor.nextInt();

        int hora = final1 - inicio1;
        int min = final2 - inicio2;

        if (min < 0) {
            hora = hora - 1;
            min = 60 + min;
        }
        if (hora < 0) {
            hora += 24;
        } else if (hora == 0 && min == 0) {
            hora = 24;
        }
        System.out.printf("O JOGO DUROU "
                + hora + " HORA(S) E " + min + " MINUTO(S)\n");

        leitor.close();
    }
}
