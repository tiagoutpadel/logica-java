/*
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno,
sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de
0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um
espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha
após o resultado, caso contrário, você receberá "Presentation Error".

Exemplos de             Entrada	Exemplos de Saída
5.0
6.0
7.0                     MEDIA = 6.3

5.0
10.0
10.0                    MEDIA = 9.0

10.0
10.0
5.0                     MEDIA = 7.5
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o valor A");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite o valor B");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite o valor C");
        double nota3 = scanner.nextDouble();

        // PROCESSAMENTO DE DADOS
        double valor1 = nota1 * 2;
        double valor2 = nota2 * 3;
        double valor3 = nota3 * 5;

        double MEDIA = (valor1 + valor2 + valor3) / 10;

        // SAIDA DE DADOS
        System.out.printf("MEDIA = %.1f%n", MEDIA);

        scanner.close();

    }
}
