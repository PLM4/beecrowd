import java.io.IOException;
import java.util.Scanner;

public class q1045 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double t1 = leitor.nextDouble();
        double t2 = leitor.nextDouble();
        double t3 = leitor.nextDouble();
        double aux = 0.0;

        if (t1 < 0 || t2 < 0 || t3 < 0) {
            System.out.println("Não é possível realizar a operação.");
        }
        if (t1 < t2 && t2 > t3) {
            aux = t2;
            t2 = t1;
            t1 = aux;
        } else if (t1 < t3 && t3 > t2) {
            aux = t3;
            t3 = t1;
            t1 = aux;
        }
        if (t1 >= t2 + t3) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (t1 * t1 == t2 * t2 + t3 * t3) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (t1 * t1 > t2 * t2 + t3 * t3) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (t1 * t1 < t2 * t2 + t3 * t3) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (t1 == t2 && t1 == t3 && t2 == t3) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (t1 == t2 || t1 == t3 || t2 == t3) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        leitor.close();
    }
}
