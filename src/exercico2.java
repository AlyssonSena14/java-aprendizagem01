import java.util.Locale;
import java.util.Scanner;

public class exercico2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A,b;
        A = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Entrada de Dados = "+A + "+" + b);
        int resultado = A+b;
        System.out.println("Resultado = "+ resultado);
        sc.close();




    }
}
