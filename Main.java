import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, BankAccount> accounts = new HashMap<>();
        BankAccount acc1 = new BankAccount("cw123", 1000);
        BankAccount acc2 = new SavingsAccount("cw127", 2000);
        BankAccount acc3 = new SavingsAccount("cw128", 3000);
        accounts.put("cw123", acc1);
        accounts.put("cw127", acc2);
        accounts.put("cw128", acc3);
        acc1.withdraw(1000);
        acc2.withdraw(400);
        acc3.withdraw(700);
        for (BankAccount acc : accounts.values()) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).applyInterest();
            }
        }
        System.out.println("\nBalances is:");
        for (String key : accounts.keySet()) {
            BankAccount acc = accounts.get(key);
            System.out.printf("Account: %s, Balance: $%.2f%n", acc.getAccountNumber(), acc.getBalance());
        }
    }
}
