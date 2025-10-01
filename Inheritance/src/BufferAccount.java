class BufferAccount extends BankAccount {
    private double minumum = -200;

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount > minumum) {
            balance -= amount;
            return true;
        }
        return false;
    }
}