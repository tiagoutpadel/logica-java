/*
Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel
que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo,
deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se
obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas
decimais após o ponto.

Entrada
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a
velocidade média durante a mesma (em km/h).

Saída
Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal

Exemplo de Entrada	                Exemplo de Saída
10
85                                  70.833

2
92                                  15.333

22
67                                  122.833
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o valor 1");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o valor 2");
        int valor2 = scanner.nextInt();

        int consumo = 12;

        // PROCESSAMENTO DE DADOS
        double viagem = valor1 * valor2;
        double media = viagem / consumo;

        // SAIDA DE DADOS
        System.out.printf("%.3f%n", media);

        scanner.close();

    }
}
