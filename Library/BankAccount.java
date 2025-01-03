package Library;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Error: Insufficient funds. Withdrawal not performed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}