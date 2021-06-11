package estruturarepeticao.enquanto;

import java.util.Scanner;

public class CalculaMediaEnquantoFeitaPorEu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorEntrada = scanner.nextInt();

        while (valorEntrada < 0) {
            System.out.println("impossivel calcular");
        }
            int x = scanner.nextInt();
            if (x > 0) {
                System.out.println(2 / (x + x));

                    }
        scanner.close();

    }
}
