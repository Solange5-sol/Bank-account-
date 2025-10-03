public class SavingsAccount extends BankAccount {
    private double interests = 0.03;
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }public void applyInterest() {
        double interest= getBalance() *interests;
        setBalance(getBalance()+interest);
        System.out.println("interests:"+interests);
    }

}
