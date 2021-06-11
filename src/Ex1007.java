/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto
de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco
antes e depois da igualdade.

Exemplos de Entrada	                    Exemplos de Saída
5
6
7
8                                       DIFERENCA = -26

0
0
7
8                                       DIFERENCA = -56

5
6
-7
8                                       DIFERENCA = 86
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o valor 1");
        int A = scanner.nextInt();

        System.out.println("Digite o valor 2");
        int B = scanner.nextInt();

        System.out.println("Digite o valor 3");
        int C = scanner.nextInt();

        System.out.println("Digite o valor 4");
        int D = scanner.nextInt();

        //PROCESSAMENTO DE DADOS

        int DIFERENCA = (A * B - C * D);

        // SAIDA DE DADOS
        System.out.println("DIFERENCA = " + DIFERENCA);

        scanner.close();

    }
}
