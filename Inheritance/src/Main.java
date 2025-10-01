public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(12313);
        account.deposit(100);
        account.withdraw(200);
        System.out.println(account.getBalance());

        BufferAccount bufferAccount = new BufferAccount();
        bufferAccount.deposit(10);
        bufferAccount.withdraw(100);
        System.out.println(bufferAccount.getBalance());
        double[] transactions = {100.5, 22.3, -45, 10};

        applyTransactions(transactions, bufferAccount);
        System.out.println(bufferAccount.getBalance());
    }


    public static void applyTransactions(double[] transactions, BankAccount account) {
        for (double transaction: transactions) {
            if (transaction > 0) {
                account.deposit(transaction);
            } else {
                account.withdraw(transaction * -1);
            }

        }
    }
}
