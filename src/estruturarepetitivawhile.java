import java.util.Locale;
import java.util.Scanner;

public class estruturarepetitivawhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int soma = 0;
        while (n1 != 0 ){
            soma += n1;
            n1 = sc.nextInt();
        }
        System.out.println(soma);


    }
}
