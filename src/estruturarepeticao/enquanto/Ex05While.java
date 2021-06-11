package estruturarepeticao.enquanto;

public class Ex05While {
    public static void main(String[] args) {

        int x = 2;
        int y = 10;
        System.out.println("OLA");

        while ( x < y) {
            System.out.println(x + "-" + y);
            x = x + 2;
            y = y + 1;
        }
    }
}
