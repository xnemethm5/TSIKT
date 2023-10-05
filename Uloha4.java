public class Uloha4 {
    public static void postupnost(int a) {

        int prvy = 0, druhy = 1, dalsi;
        System.out.print(prvy + " " + druhy);

        for(int i = 2; i < a; i++ ) // idem od 2 pretože prvé dva vypisujem na tvrdo
        {
            dalsi = prvy + druhy;
            System.out.print(" "+dalsi);
            prvy = druhy;
            druhy = dalsi;
        }
    }
}
