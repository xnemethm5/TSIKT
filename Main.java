public class Main {
    public static void main(String[] args) {
            Clovek c1 = new Clovek("Majkel",21,10);
            System.out.println(c1.getMeno());
            System.out.println(c1.getVek());
            c1.porovnajVek();
            c1.setVek(50);
            c1.setMeno("Marco\n");
            System.out.println(c1.vek);
            System.out.println(c1.meno);
            c1.porovnajVek();
            c1.vypisCisla(10);
        }
}
