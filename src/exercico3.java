import java.util.Scanner;

public class exercico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        if (numero >= 0){
            System.out.println("Esse numero é possitivo");
        }
        else{
            System.out.println("Esse numero é negativo");
        }
    }
}
