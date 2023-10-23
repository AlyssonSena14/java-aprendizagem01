import java.util.Locale;
import java.util.Scanner;

public class exercico10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double salario = sc.nextDouble();
        double resultado;

        if (salario <= 2000.01){
            System.out.println("Isento");
        }
        else if (salario <= 3000.01) {
            resultado = (salario - 2000.00) * 0.08;
            System.out.printf("Imposto = R$ %.2f",resultado);
            }
        else if (salario <= 4500.00){
            resultado = (salario - 3000.00) * 0.18 + 1000.0 * 0.08;
            System.out.printf("Imposto = R$ %.2f", resultado);
        }
        else {
            resultado = (salario - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("Imposto = R$ %.2f",resultado);
        }
        sc.close();








        }






    }

