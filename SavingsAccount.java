class SavingsAccount extends BankAccount{
    private double urokovaSadzba;
    private double balance;
    public SavingsAccount(String accountNumber, double balance, double urokovaSadzba) {
        super(accountNumber, balance);
        this.urokovaSadzba = urokovaSadzba;
        this.balance = balance;
    }

    public double urokoveP(double amount){
        return (amount * 0.05);
    }

}
