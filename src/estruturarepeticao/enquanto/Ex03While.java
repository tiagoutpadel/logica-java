package estruturarepeticao.enquanto;

public class Ex03While {
    public static void main(String[] args) {

        double x = 100.0;
        double y = 100.0;

        while (x != y) {
            System.out.println("OLHA");
            x = Math.sqrt(y);

        }
    }
}
