/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2.
Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo,
com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas,
não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada	            Exemplos de Saída
2.00                            A=12.5664

100.64                          A=31819.3103

150.00                          A=70685.7750
 */


import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        Scanner scanner = new Scanner(System.in);
        // ENTRADA DADOS AREA
        System.out.println("Digite o valor da 1 entrada");
        Double valor1 = scanner.nextDouble();

        System.out.println("Digite o valor da 2 entrada");
        Double valor2 = scanner.nextDouble();

        System.out.println("Digite o valor da 3 entrada");
        Double valor3 = scanner.nextDouble();

        // PROCESSAMENTO DADOS
        Double n = 3.14159;
        Double a;
        a = Math.pow(valor1, 2.0);
        Double area = a * n;

        Double b;
        b = Math.pow(valor2, 2.0);
        Double area2 = b * n;

        Double c;
        c = Math.pow(valor3, 2.0);
        Double area3 = c * n;

        // SAIDA DE DADOS
        System.out.printf("A=%.4f%n", area);
        System.out.printf("A=%.4f%n", area2);
        System.out.printf("A=%.4f%n", area3);

    scanner.close();
    }
}
