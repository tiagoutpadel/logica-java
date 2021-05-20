import java.util.Locale;
import java.util.Scanner;

public class testeClasse {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner  tiago= new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x= tiago.nextInt();

        tiago.nextLine();


        s1 = tiago.nextLine();
        s2 = tiago.nextLine();
        s3 = tiago.nextLine();

        System.out.println("DADOSDIGITADOS:");
        System.out.println(x);
        System.out.println("s1 -> " + s1);
        System.out.println("s2 -> " + s2);
        System.out.println("s3 -> " + s3);

        tiago.close();

    }

}














