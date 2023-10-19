import java.util.Locale;
public class exercico1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String product1 = "compunter";
        String product2 = "Offcie Disk";
        int age = 30;
        int code = 5290;
        char gender = 'f';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("%s, which price is %.2f%n ",product1,price1 );
        System.out.printf("%s, which price is %.2f ",product2,price2);
        System.out.printf("%n%d years old, code %d and gender: %s",age,code,gender);
        System.out.printf("%nMeasue with eight Decimal places: %.8f",measure);
        System.out.printf("%nRouded: %.3f",measure);
        System.out.printf("%nUS decimal poínt: %.3f",measure);


        
    }
}
