import java.util.Locale;
import java.util.Scanner;

public class Exercico1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int VelocidadeMedia = scanner.nextInt();
        int TempoPercorrido = scanner.nextInt();
        int KmlitroVeiculo = 12;

        double DistanciaTotal = VelocidadeMedia * TempoPercorrido;
        double ConsumoLitros = DistanciaTotal / KmlitroVeiculo;

        System.out.printf("%.3f%n", ConsumoLitros);

        scanner.close();
    }
}


