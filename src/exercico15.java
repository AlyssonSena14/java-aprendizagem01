import java.util.Scanner;

public class exercico15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n -1; i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            if (x == 0){
                System.out.println("Divisão impossivel");
            }
            else {
                double div = (double) y/x;
                System.out.printf("%.1f%n", div);
            }


        }
    }
}
