import java.security.KeyStore;

public class OperadoresComparacao {

    public static void main(String[] args) {

        //MENOR QUE
        boolean menorQue = 5<10;
        System.out.println("MENOR QUE => " + menorQue);

        //MAIOR QUE
        System.out.println(5 > 10);

        //MENOR OU IGUAL A QUE
        System.out.println(10 <= 10);

        //MAIOR OU IGUAL A QUE
        System.out.println(10 >= 10);

        //IGUALDADE
        System.out.println(5 == 10);

        //DIFERENTE
        System.out.println(5 != 10);

        System.out.println("---------------------------------------------------------------------------------");

        int x = 5;
        System.out.println(x > 0); // TRUE
        System.out.println(x == 3); // FALSE
        System.out.println(10 <= 30); // TRUE
        System.out.println(x != 2); // TRUE

        System.out.println("---------------------------OPERADORES LOGICOS---AND OU E------------------");

        System.out.println(x <= 20 && x == 10); // false
        System.out.println(x > 0 && x != 3); // true
        System.out.println(x <= 20 && x == 10 && x != 3); // false

        System.out.println("---------------------------OPERADORES LOGICOS---OR ou OU------------------");

        System.out.println(x <= 20 || x == 10); //true
        System.out.println(x > 0 || x != 3); // true
        System.out.println(x <= 20 || x == 10 || x != 3); // true

        System.out.println("---------------------------OPERADORES LOGICOS---NAO ou NOT------------------");

        //!(x == 10) ---- Verdadeiro // converte valor verdadeiro para falso ou vice versa.
        //!(x >= 2) ---- Falso
        //!(x<= 20 && x == 10) ----

        System.out.println(!(x <= 20 && x == 10)); // false
        System.out.println(!(x > 0 && x != 3)); // true
        System.out.println(!(x <= 20 && x == 10 && x != 3)); // false




    }
}