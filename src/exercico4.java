import java.util.Locale;
import java.util.Scanner;

public class exercico4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = sc.nextInt();
        int resultado = n % 2;
        if (resultado == 0){
            System.out.printf( "%d e um numero par %n", n);
        }else {
            System.out.printf("%d e um numero impar %n", n);
        }
        sc.close();


    }
}
