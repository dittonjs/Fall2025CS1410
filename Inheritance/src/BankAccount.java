public class BankAccount {
    protected double balance = 0.0;
    private int accountNumber;
    public BankAccount() {
        this(0);
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
