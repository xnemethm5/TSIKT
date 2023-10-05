public class Uloha2 {
    public static void sumAll(int a){

        int b = 0;

        for(int i = a; i > 0; i--)
        {
            for(int k = 1; k < a; k++)
            {
                b = b + k ;
            }
            System.out.println(i + "->" + b);
            b = 0;
            a--;
        }
    }
}
