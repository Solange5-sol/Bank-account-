import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, BankAccount> accounts = new HashMap<>();
        BankAccount acc1=new CheckingAccoun("cw123",200000000);
        BankAccount acc2=new SavingsAccount("cw127",300);
        BankAccount acc3=new SavingsAccount("cw128",100);
        accounts.put("cw123",acc1);
        accounts.put("cw127",acc2);
        accounts.put("cw128",acc3);
        acc1.deposit(5000);
        acc2.deposit(500);
        acc3.deposit(50);
        acc1.withdraw(1000);
        acc2.withdraw(400);
        acc3.withdraw(700);
        for (String accNum : accounts.keySet()) {
            BankAccount acc =  accounts.get(accNum);
            System.out.printf("Account: %s, Balance: $%.2f%n", accNum, acc.getBalance());
        }
    }
}