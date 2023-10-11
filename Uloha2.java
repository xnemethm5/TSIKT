import java.util.Scanner;

public class Uloha2 {
    public static void tolowString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj reťazec: ");
        String str = scanner.nextLine();

        System.out.println(str.toLowerCase());
    }

    public static void spaceRemove() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj reťazec: ");
        String str = scanner.nextLine();

        String nospacestr = str.replaceAll(" ","");
        System.out.println("Reťazec bez medzier: "+nospacestr);
    }

    public static void strToWord() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj reťazec: ");
        String str = scanner.nextLine();

        String[] wrds = str.split(" ");

        System.out.println("Slová z reťazca: \n");
        for(String wrd : wrds)
        {
            System.out.println(wrd);
        }
    }

    public static void rplcString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj reťazec: ");
        String str = scanner.nextLine();
        System.out.println("Zadaj znak, ktorý chceš zameniť: ");
        String strA = scanner.nextLine();
        System.out.println("Zadaj znak,za aký ho chceš zameniť: ");
        String strB = scanner.nextLine();

        String rplcd = str.replaceAll(strA,strB);
        System.out.println("Nový reťazec: "+rplcd);
    }

    public static void palindrom() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj reťazec: ");
        String str = scanner.nextLine();
        String tmpStr = str.replaceAll(" ","").toLowerCase();
        String reverseStr = new StringBuilder(tmpStr).reverse().toString() ;

        if(tmpStr.equals(reverseStr))
        {
            System.out.println("Reťazec je palindróm");
        }
        else
        {
            System.out.println("Reťazec nie je palindróm");
        }
    }
}
