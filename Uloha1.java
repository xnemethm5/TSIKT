class Uloha1 {
    public static void isPrvocislo(int n) {

        if (n % 2 != 0 || n == 2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void Faktorial(int f) {

        for (int i = f; i > 1; i--) {
            f = f*(i-1);
        }
        System.out.println(f);
    }
}
