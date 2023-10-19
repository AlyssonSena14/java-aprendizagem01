
import java.util.Locale;
import java.util.Scanner;
public class entradadedadosemjava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String g;
        int y;
        double x;
        g = sc.next();
        y = sc.nextInt();
        x = sc.nextDouble();
        System.out.println("Você digitou: ");
        System.out.printf("Dados:  %s tem %d anos e tirou nota %.1f",g,y,x);
        sc.close();


    }
}
