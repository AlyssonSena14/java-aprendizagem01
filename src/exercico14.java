import java.util.Locale;
import java.util.Scanner;

public class exercico14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x = sc.nextInt();
        
        for (int i = 0; i < x; i++){
            double n = sc.nextDouble();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            double soma = (n * 2.0 + n1 * 3.0 + n2 * 5.0 / 10);

            System.out.printf("%.1f%n",soma);
        }
        sc.close();




    }


}
