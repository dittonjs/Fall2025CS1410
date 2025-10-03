public class BankAccount {
    private float balance = 0.0f;
    private int accountNumber;


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

    protected void setBalance(double balance) {
        this.balance = (float)balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
