import java.util.Scanner;

public class exercico6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fim = sc .nextInt();

        int duracao;
        if (inicio < fim){
            duracao = fim - inicio;
        }else {
            duracao = 24 - inicio - fim;
        }
        System.out.println("O jogo durou " + duracao + " hora(s)");
        sc.close();

    }
}
