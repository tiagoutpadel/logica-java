public class OperadoresComparacao {

    public static void main(String[] args) {
        // MENOR QUE
        boolean menorQue = 5 < 10;
        System.out.println("MENOR QUE ->" + menorQue);

        // MAIOR QUE
        boolean maiorQue = 5> 10;
        System.out.println("MENOR QUE ->" + maiorQue);

        //MENOR OU IGUAL A QUE
        boolean menorIgualaQue = 5 <= 10;
        System.out.println("MENOR OU IGUAL A QUE ->" + menorIgualaQue);

        // MAIOR OU IGUAL A QUE
        boolean maiorIgualQue = 5 >= 10;
        System.out.println("MAIOR OU IGUAL A QUE ->" + maiorIgualQue);

        //IGUALDADE
        boolean igualdade = 5 == 10;
        System.out.println("IGUALDADE ->" + igualdade);

        //DIFERENTE
        boolean diferente = 5 != 10;
        System.out.println("DIFERENTE ->" + diferente);

        System.out.println("-----------------------------------------------");

        int x = 5;
        System.out.println( x > 0);
        System.out.println(x == 3);
        System.out.println(10 <=30);
        System.out.println(x != 2);

        System.out.println("------------------OPERADORES LOGICOS-----AND E------------------------");

        System.out.println((x <= 20) && (x == 10));

        System.out.println((x > 0) && (x !=3));

        System.out.println((x <= 20) && (x == 10) && (x != 3));

        System.out.println("------------------OPERADORES LOGICOS-----OR ou OU------------------------");

        System.out.println(x <= 20 || x == 10);

        System.out.println(x > 0 || x !=3);

        System.out.println(x <= 20 || x == 10 || x != 3);

        System.out.println("------------------OPERADORES LOGICOS-----NÃO ou NOT------------------------");

        System.out.println(!(x == 10));

        System.out.println(!(x >= 2));

        System.out.println(!((x <= 20) && (x == 10)));


    }
}
