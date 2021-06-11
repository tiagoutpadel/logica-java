import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeImc {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o nome");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura");
        double altura = scanner.nextDouble();

        // PROCESSAMENTO DE DADOS
        double resultado = peso / (altura * altura);

        // SAIDA DE DADOS //https://docs.oracle.com/javase/tutorial/java/data/numberformat.html(site com codigos de formatacao)

        System.out.printf("o resultado e %.2f%n", resultado);

        if(resultado <= 18.5) {
            System.out.println("Magreza");
        }else if(resultado >= 18.6 && resultado < 24.9) {
            System.out.println("Normal");
        }else if(resultado >= 25.0 && resultado <= 30.0) {
            System.out.println("Sobrepeso");
        }else if(resultado > 30.0) {
            System.out.println("Obesidade");
        }

        System.out.printf("Oi, meu nome e %s e tenho %d anos e o meu imc e %.2f" , nome, idade, resultado);

        scanner.close();

    }
}
