import java.util.Locale;
import java.util.Scanner;

public class TesteDeEntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String VariavelSemEspaco = scanner.next(); //captura o texto digitado sem espaco, o que tiver depois do espaco ignora.

        System.out.println(VariavelSemEspaco); //

        Double valorComVirgula = scanner.nextDouble(); // recebe numeros com virgula
        System.out.println(valorComVirgula);

        int valorInteiroSemVirgula = scanner.nextInt(); // recebe valores inteiros sem virgula
        System.out.println(valorInteiroSemVirgula);

        char variavelQueRecebeSomenteUmCaracter = scanner.next().charAt(0); // recebe somente 1 caractere, ex M ou F (masc e fem)
        System.out.println(variavelQueRecebeSomenteUmCaracter);

        String x;
        int y;
        double z;
                    // Esse tipo pode preencher os campos todos na mesma linha
        x = scanner.next();
        y = scanner.nextInt();
        z = scanner.nextDouble();


        int sx; //QUEBRA DE LINHA PENDENTE - para resolver basta colocar um nextline antes da primeira declaracao consumida
        String s1, s2, s3; // nesse caso o nextline vai na linha 35

        sx = scanner.nextInt();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println("DADOS SIGITADOS");
        System.out.println("S1 -> " +s1);
        System.out.println("S2 -> " +s2);
        System.out.println("S3 -> " +s3);


        scanner.close();

    }
}
