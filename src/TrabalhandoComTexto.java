import java.util.Scanner;

public class TrabalhandoComTexto {

    public static void main(String[] args){

        /* Criar mensagem que solicita ao usuario o nome e a idade*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner .nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();
        
        // *** PROCESSAMENTO ***
        
        String valoresConcatenados = "Oi, meu nome é " + nome + ", tenho " + idade + ", minha altura é" + altura + " e estou pesando " + peso;
        
        // SAIDA DE DADOS
        System.out.println(valoresConcatenados);
        
        scanner.close();

    }


}
