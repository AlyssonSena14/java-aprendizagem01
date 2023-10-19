import java.util.Locale;
public class aula2 {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        System.out.printf("%.4f%n",x);
        System.out.println(y);
        System.out.println("Bom dia !");
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f metros%n",x);
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);

    }
}
