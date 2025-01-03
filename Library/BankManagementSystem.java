package Library;

public class BankManagementSystem {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(400.0);
        System.out.println("Current Balance: $" + account.getBalance());

    }
}