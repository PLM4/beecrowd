import java.util.Scanner;

public class q1114 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();

        while (x != 2002) {
            System.out.println("Senha Invalida");

            x = leitor.nextInt();

        }
        if (x == 2002) {
            System.out.println("Acesso Permitido");

        }
        leitor.close();
    }
}
