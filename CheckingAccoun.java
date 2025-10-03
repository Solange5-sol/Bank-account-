public class CheckingAccoun extends BankAccount {
    private double overdraftLimit=1000;
    public CheckingAccoun(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount > overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawing " + amount + " from account " + getAccountNumber());
        }else {
            System.out.println("limit exceeded");
        }
    }

}
