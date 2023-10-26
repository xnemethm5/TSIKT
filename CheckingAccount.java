class CheckingAccount extends BankAccount{
    private double poplatky;
    private double balance;
    public CheckingAccount(String accountNumber, double balance, double poplatky) {
        super(accountNumber, balance);
        this.balance = balance;
        this.poplatky = poplatky;
    }

    public double poplatkyTrans(double amount){
        return (amount - 1);
    }

}