import java.io.IOException;
import java.util.Scanner;

public class Uloha3 {
    public static void kalkulacka() throws IOException {

        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj dve čísla: ");
        int x = vstup.nextInt();
        int y = vstup.nextInt();

        System.out.println("Zadaj operáciu");
        char o = (char) System.in.read();
        if( o == '+'){

            int plus = x + y;
            System.out.println(plus);

        }else if (o == '-')
        {
            int minus = x - y;
            System.out.println(minus);

        } else if ( o == '*')
        {

            int krat = x * y;
            System.out.println(krat);

        } else if (o == '/') {

            if(y == 0 || x == 0)
            {
                System.out.println("Delenie nulou nie je mozne");
            }
            else{
                int deleno = x / y;
                System.out.println(deleno);
            }
        }
        else{
            System.out.println("Chybný vstup :)");
        }

    }
}
