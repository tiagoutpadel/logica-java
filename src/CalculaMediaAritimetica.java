import java.util.Scanner;

public class CalculaMediaAritimetica {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo valor");
        double segundoNumero = scanner.nextDouble();


        // *** PROCESSAMENTO ***
        double resultado = (primeiroNumero + segundoNumero) / 2;

        // *** SAIDA DE DADOS ***
        System.out.println("O resultado e " +  resultado);

    }
}