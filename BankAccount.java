import java.security.PublicKey;

public class BankAccount {
    private double balance;
    private String accountNumber;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        if (amount>0){
            this.balance += amount;
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            this.balance -= amount;
            balance -= amount;
            System.out.println("withdraw:"+amount);
        }else {
            System.out.println("withdraw failed");
        }
    }
    public void applyInterest() {

    }

}
