import java.util.Scanner;

public class Uloha1 {

    public static void mrgString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj prvy retazec: ");
        String string1 = scanner.nextLine();

        System.out.println("Zadaj druhy retazec: ");
        String string2 = scanner.nextLine();

        String string3 = string1 + string2;
        System.out.println("Spojený retazec: "+ string3);
    }

    public static void lngtString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj reťazec: ");
        String inputString = scanner.nextLine();

        int dlzka = inputString.length();
        System.out.println("Dĺžka reťazca je: "+dlzka);
    }

    public static void iseqlString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj prvý reťazec: ");
        String str1 = scanner.nextLine();
        System.out.println("Zadaj druhý reťazec: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2))
        {
            System.out.println("Reťazce sú totožné");
        }
        else
        {
            System.out.println("Reťazce nie sú totožné");
        }

    }

    public static void searchString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj reťazec: ");
        String inpstr = scanner.nextLine();
        System.out.println("Zadaj hladaný reťazec: ");
        String srchstr = scanner.nextLine();

        boolean a = inpstr.contains(srchstr);

        if(a)
        {
            System.out.println(srchstr+" sa nachádza v zadanom reťazci.");
        }else
        {
            System.out.println(srchstr+" sa nenachádza v zadanom reťazci.");
        }
    }

    public static void toupString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj reťazec: ");
        String str = scanner.nextLine();

        System.out.println(str.toUpperCase());
    }
}
