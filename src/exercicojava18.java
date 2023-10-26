import java.util.Scanner;

public class exercicojava18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        for (int i = 1;i <= n1; i++ ){
            int primeiro = i * i;
            int Segundo = i * i * i;
            System.out.printf("%d %d %d%n ", i, primeiro,Segundo);
        }
        sc.close();

    }
}
