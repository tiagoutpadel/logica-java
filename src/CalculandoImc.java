import java.util.Scanner;

public class CalculandoImc {

    public static void main(String[] args){

        // *** FAZER O CALCULO DO IMC ***

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        // ***PROCESSAMENTO ***

        double resultado = peso / (altura * altura);

        // ***SAIDA DE DADOS ***
        System.out.println(resultado);


        scanner.close();



    }


}
