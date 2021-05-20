import java.util.Locale;
import java.util.Scanner;

// ***https://docs.oracle.com/javase/tutorial/java/data/numberformat.html ***

public class TrabalhandoComTexto {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        /* Criar mensagem que solicita ao usuario o nome e a idade*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner .nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();


        // *** PROCESSAMENTO ***
        
       System.out.printf("o meu nome é %s e tenho %d anos, minha altura é %.2f", nome, idade, altura);




        scanner.close();

    }


}
