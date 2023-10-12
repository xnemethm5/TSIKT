import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Uloha1.mrgString();
        Uloha1.lngtString();
        Uloha1.iseqlString();
        Uloha1.searchString();
        Uloha1.toupString();

        Uloha2.tolowString();
        Uloha2.spaceRemove();
        Uloha2.strToWord();
        Uloha2.rplcString();
        Uloha2.palindrom();

        Zamestnanec[] zamestnanci = new Zamestnanec[2];

        for(int i = 0 ; i < 2; i++) {
            System.out.println("Zadaj meno pre zamestnanca " + (i + 1) + ": ");
            String meno = scanner.nextLine();
            System.out.println("Zadaj vek pre zamestnanca " + (i + 1) + ": ");
            int vek = scanner.nextInt();
            System.out.println("Zadaj plat pre zamestnanca " + (i + 1) + ": ");
            int plat = scanner.nextInt();
            scanner.nextLine();

            zamestnanci[i] = new Zamestnanec(meno, vek, plat);

        }
        System.out.println("Zamestnanci:");
        for (Zamestnanec z : zamestnanci) {
            System.out.println("Meno: " + z.getMeno() + ", Vek: " + z.getVek() + " ,Plat: " + z.getPlat());
        }
    }
}
