package estruturarepeticao.enquanto;

public class Ex04While {
    public static void main(String[] args) {

        int x = 0;

        while (x < 5) {
           int y = x * 3;
            System.out.println(y);
            x = x +1;
        }
        System.out.println("FIM");
    }
}
