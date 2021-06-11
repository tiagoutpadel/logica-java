package estruturarepeticao.enquanto;

public class Ex01While {
    public static void main(String[] args) {

        int x = 5;
        int y = 0;

        while (x > 2) {
            System.out.print(x);
            x = y + x;
            x = x - 1;
        }
    }




}
