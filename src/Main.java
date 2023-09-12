import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        // Meyvelerin fiyatları
        double armutFiyat = 2.14,elmaFiyat = 3.67,domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5,total;

        // Meyvelerin kiloları
        double elmaKilo,armutKilo,domatesKilo,muzKilo,patlicanKilo;


        System.out.println("Manava hoşgeldiniz. Fiyat hesaplaması için lütfen aldığınız ürünlerin kilo değerlerini kg cinsinden yazınız.");
        System.out.print("Kaç kilo armut aldınız?: ");
        armutKilo = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız?: ");
        elmaKilo = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız?: ");
        domatesKilo = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız?: ");
        muzKilo = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız?: ");
        patlicanKilo = input.nextDouble();

        System.out.println("Teşekkürler, hemen hesaplıyorum...");
        total = (armutKilo*armutFiyat) + (elmaFiyat*elmaKilo) + (domatesFiyat*domatesKilo) + (muzFiyat*muzKilo) + (patlicanFiyat*patlicanKilo) ;
        Thread.sleep(2000);

        System.out.printf("Toplam tutarınız: %s%n",formatter.format(total));
    }
}