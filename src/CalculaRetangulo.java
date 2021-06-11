import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler as medidas da base e altura de um retângulo.
Em seguida,  mostrar o valor da área, perímetro e diagonal deste retângulo,
com quatro casas  decimais, conforme exemplo.

Exemplo:


Entrada:        Saída:
5.0             AREA = 20.0000
4.0             PERIMETRO = 18.0000
                DIAGONAL = 6.4031

 */
public class CalculaRetangulo {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        // ENTRADA DE DADOS
        System.out.println("DIgite o valor da base");
        double base = scanner.nextDouble();

        System.out.println("Digite o valor da altura");
        double altura = scanner.nextDouble();

        // PROCESSAMENTO DE DADOS
        double area = base * altura;
        double perimetro = 2 * base + 2 * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        // SAIDA DE DADOS SEM FORMATACAO
        System.out.println("AREA = " + area);
        System.out.println("PERIMETRO = " + perimetro);
        System.out.println("DIAGONAL = " + diagonal);

        System.out.println("-----------------------------------------------------------------------------");

        // SAIDA DE DADOS COM FORMATACAO
        System.out.printf("AREA = "+"%.5f%n", area);
        System.out.printf("PERIMETRO = "+"%.5f%n", perimetro);
        System.out.printf("DIAGONAL = "+"%.5f%n", diagonal);

    }
}
