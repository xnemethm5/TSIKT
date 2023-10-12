import java.util.Scanner;

public class Main {
    private Zamestnanec z01,z02,z03,z04;

    public void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

       /* Uloha1.mrgString();
        Uloha1.lngtString();
        Uloha1.iseqlString();
        Uloha1.searchString();
        Uloha1.toupString();

        Uloha2.tolowString();
        Uloha2.spaceRemove();
        Uloha2.strToWord();
        Uloha2.rplcString();
        Uloha2.palindrom();*/

        System.out.println("Zadaj meno: ");
        String meno = scanner.nextLine();
        System.out.println("Zadaj vek: ");
        int vek = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadaj plat: ");
        int plat = Integer.parseInt(scanner.nextLine());
        this.z01.setMeno(meno);
        this.z01.setVek(vek);
        this.z01.setPlat(plat);
    }
}
