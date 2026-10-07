package in.yograj.beans;

public class Account {
    private int accountId;
    private double balance;

    public Account(){
        System.out.println("Account bean created!");
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
