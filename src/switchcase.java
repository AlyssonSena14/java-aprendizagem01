import java.util.Locale;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x = sc.nextInt();
        String dia;
        if (x == 1) {
            dia = "domingo";
        }else if ( x == 2) {
            dia = "Segunda";
        }else  if ( x == 3) {
            dia = "terça-feira";
        } else if (x == 4) {
            dia = "quarta";
        } else if (x == 5) {
            dia = "quinta";
        } else if (x == 6) {
            dia = "Sexta";
        } else if (x == 7) {
            dia = "sabado";
        } else {
            dia = "valor invalido";
        }
        System.out.printf(" %s ",dia);

        }

    }



