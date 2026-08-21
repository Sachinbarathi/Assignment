class BankAccount {
    private double balance = 1000;

    public double getBalance() {
        return balance;
    }
}

public class DataHiding {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.getBalance());
    }
}
