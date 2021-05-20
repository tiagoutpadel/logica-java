import java.util.Locale;
import java.util.Scanner;

public class Formatacao {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x = 10.3578;

        /// *** IMPRIME O TEXTO SEM UMA NOVA LINHA ***

        System.out.print(x);

        // ***IMPRIME O TEXTO COM UMA NOVA LINHA ***
        System.out.println(x);


        // ***IMPRIME O VALOR DE SAIDA***

        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        scanner.close();


    }
}
