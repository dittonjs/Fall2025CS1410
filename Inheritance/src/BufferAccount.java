class BufferAccount extends BankAccount {

    public BufferAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public boolean withdraw(double amount) {
        double minimum = -200;
        if (getBalance() - amount > minimum) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
}