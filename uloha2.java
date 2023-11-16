
import java.util.InputMismatchException;
        import java.util.Scanner;
public class uloha2 {

    public static void main(String[] args) {
        int cislo = integer();
        System.out.println(cislo);
    }
    public static int integer(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Zadaj celé číslo: ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Nezadal si číslo.");
                scanner.nextLine();
            }
        }
    }
}