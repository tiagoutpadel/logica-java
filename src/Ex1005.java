/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir,
calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um
espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas,
não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada	            Exemplos de Saída
5.0
7.1                             MEDIA = 6.43182

0.0
7.1                             MEDIA = 4.84091

10.0
10.0                            MEDIA = 10.00000
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS

        System.out.println("Digite o valor de A");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o valor de B");
        double valor2 = scanner.nextDouble();

        // PROCESSAMENTO DE DADOS
        double media1 = valor1 * 3.5;
        double media2 = valor2 * 7.5;

        double MEDIA = (media1 + media2) / 11;

        // SAIDA DE DADOS
        System.out.printf("%.5f%n", MEDIA);

        scanner.close();
    }
}
