public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public void applyInterest() {
        double interestRate = 0.50;
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Interest applied: $" + interest);
    }
}

