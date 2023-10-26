abstract class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double amount){
       return balance = balance + amount;
    }
    double withdraw(double amount){
        return balance = balance - amount;
    }

}
