import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String variavelSemEspaco = scanner.next();

        System.out.println(variavelSemEspaco);

        double valorComVirgula = scanner.nextDouble();
        System.out.println(valorComVirgula);

        int valorIteiroSemVirgula = scanner.nextInt();
        System.out.println(valorIteiroSemVirgula);

        char variavelQueRecebeSomenteUmCaracter = scanner.next().charAt(0);
        System.out.println(variavelQueRecebeSomenteUmCaracter);

        scanner.close();
    }
}
