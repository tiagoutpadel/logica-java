import java.util.Locale;

public class Formatacao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //altera localidade para US

       double x = 10.35784;

       System.out.print(x); //imprimi o texto lado a lado sem nova linha

       System.out.println(x); //imprimi o texto com nova linha, um abaixo do outro

        System.out.printf("%.2f%n" , x); //comando % arredonda o numero, depois do ponto quantas casa decimais
        System.out.printf("%.4f%n" , x); //imprimi valor e formata a saida
    }
}
