import java.util.Locale;
import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Bom dia = 05 - 11
        //Boa tarde = 12 - 17
        //Boa noite = 18 - 04

        System.out.println("Digite a hora");
        int hora = scanner.nextInt();

        if(hora <= 11) {
            System.out.println("Bom dia");
        }else if(hora >=12 && hora <= 17) {
            System.out.println("Boa tarde");
        }else {
            System.out.println("Boa noite");
        }

    }
}
