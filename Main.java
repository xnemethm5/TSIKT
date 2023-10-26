public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Miki", 6);
        Cat cat = new Cat("Jahoda", 2);

        System.out.println("Dog:");
        dog.displayInfo();
        dog.makeSound();

        System.out.println("\nCat:");
        cat.displayInfo();
        cat.makeSound();

        Rectangle rectangle = new Rectangle("\nMoj rectangel", 5,8);
        rectangle.displayInfo();

        Circle circle = new Circle("\nMoj circel", 3);
        circle.displayInfo();

        SavingsAccount savingsAccount = new SavingsAccount("SA123", 100, 5);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 150, 1);


        savingsAccount.deposit(500);
        checkingAccount.deposit(300);
        savingsAccount.withdraw(200);
        checkingAccount.withdraw(100);

        System.out.println("\nZostatok na účte úspor: " + savingsAccount.getBalance());
        System.out.println("Zostatok na kontrolnom účte: " + checkingAccount.getBalance());
        System.out.println("Urokova sadzba 5%: " + savingsAccount.urokoveP(200));
        System.out.println("Poplatok za transakciu 1e: " + checkingAccount.poplatkyTrans(200));
    }
}
