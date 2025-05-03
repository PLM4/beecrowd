import java.util.Scanner;

public class q1079 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int x = leitor.nextInt();


    for (int i = 1; i <= x; i++) {
        float k = leitor.nextFloat();
        float l = leitor.nextFloat();
        float t = leitor.nextFloat();

        float media = ((k*2)+(l*3)+(t*5))/10;
      
        System.out.printf("%.1f%n", media);  
    }
    leitor.close();
    }
}
