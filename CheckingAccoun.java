public class CheckingAccoun extends BankAccount {
    public CheckingAccoun(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) {
     if (amount >0&& amount<= getBalance()+getOverdraftLimit())
     {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawing " + amount + " from account " + getAccountNumber());
        }else {
            System.out.println("failed");
        }
    }
}
