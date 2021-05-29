import java.util.Locale;
import java.util.Scanner;

public class Exercicio1005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double PesoA = 3.5;
        double B = scanner.nextDouble();
        double PesoB = 7.5;
        double SomaDosPesos = 11.0;

        double Peso = (A * PesoA) + (B * PesoB);

        double Media = Peso / SomaDosPesos;

        System.out.printf("MEDIA = %.5f%n", Media);

scanner.close();


    }




}
