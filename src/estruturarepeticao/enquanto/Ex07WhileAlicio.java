package estruturarepeticao.enquanto;
import java.util.Scanner;

public class Ex07WhileAlicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != y) {

            if(x < y){
                System.out.println("Crescente");
            }else{
                System.out.println("Decrescente");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        scanner.close();
    }
}

