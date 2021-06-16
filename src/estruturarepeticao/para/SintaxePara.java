package estruturarepeticao.para;

import java.util.Scanner;

public class SintaxePara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;
        int auxiliar = 0;

        while(N >=  0) {
            auxiliar = scanner.nextInt();
            count = auxiliar + N;
            System.out.println(count);
        }

scanner.close();
    }

}
