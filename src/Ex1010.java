/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e
um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois
pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

Exemplos de Entrada	                    Exemplos de Saída
12 1 5.30
16 2 5.10                               VALOR A PAGAR: R$ 15.50

13 2 15.30
161 4 5.20                              VALOR A PAGAR: R$ 51.40

1 1 15.10
2 1 15.10                               VALOR A PAGAR: R$ 30.20
 */

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS

        System.out.println("Digite o codigo da peca 1");
        int codigo = scanner.nextInt();

        System.out.println("Digite o numero de pecas 1");
        int numero = scanner.nextInt();

        System.out.println("Digite o valor unitario peca 1");
        double valor = scanner.nextDouble();

        System.out.println("Digite o codigo da peca 2");
        int codigo2 = scanner.nextInt();

        System.out.println("Digite o numero de pecas 2");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o valor unitario peca 2");
        double valor2 = scanner.nextDouble();

        // PROCESSAMENTO DE DADOS
        double total = numero * valor;
        double total2 = numero2 * valor2;

        // SAIDA DE DADOS
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", (total + total2));

        scanner.close();

    }
}
