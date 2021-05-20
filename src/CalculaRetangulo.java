import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler as medidas da base e altura de um retângulo.
Em seguida,  mostrar o valor da área, perímetro e diagonal deste retângulo,
com quatro casas  decimais, conforme exemplo.

Exemplo:
 Entrada:       Saída:
5.0             AREA = 20.0000
4.0             PERIMETRO = 18.0000
                DIAGONAL = 6.4031
  */

public class CalculaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double base = 5.0;
        double altura = 4.0;

        double area = base * altura;
        double perimetro = 2* base + 2 * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.println("AREA = " + area);
        System.out.println("PERIMETRO = " + perimetro);
        System.out.println("DIAGONAL = " + diagonal);

        //ESTUDAR P.E.M.D.A.S.

        scanner.close();
    }





}
