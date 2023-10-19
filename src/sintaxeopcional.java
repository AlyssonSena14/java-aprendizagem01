import java.util.Locale;
import java.util.Scanner;

public class sintaxeopcional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int minuto = sc.nextInt();

        double conta = 50.0;

        if (minuto > 100){
            conta = conta + (minuto - 100) * 2.0;
        }

        System.out.printf("O Valor da conta = R$ %.2f%n", conta);

        sc.close();

    }
}
