import java.util.Locale;
import java.util.Scanner;

public class exercico8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();

        if (n1 <= 25){
            System.out.println(" intervalo [0,25]");
        } else if (n1 <= 50) {
            System.out.println(" intervalo [25,50]");
        } else if (n1 <= 75) {
            System.out.println(" intervalo [50,75]");
        } else if (n1 <= 100) {
            System.out.println(" intervalo [75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }
    }
}
