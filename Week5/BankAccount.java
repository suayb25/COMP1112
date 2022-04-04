import java.util.Date;

public class BankAccount {//Show it and add transfer function

    private int accountId = 1000;
    private double balance = 0.0;
    private final Date dateCreated;
    private static int count;

    public BankAccount(double iBalance) {
        this.balance = iBalance;
        this.accountId+=count;
        count++;
        this.dateCreated = new Date();
    }
    public BankAccount() {
        this.accountId+=count;
        count++;
        this.dateCreated = new Date();
    }

    public boolean withdraw(double amount) {//Already implemented
        if(balance>=amount){
            balance-=amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {//Already implemented
        balance+=amount;
    }

    public boolean transfer(double amount, BankAccount toAccount) {
        if(balance>=amount){
            balance-=amount;
            toAccount.deposit(amount);
            return true;
        }
        return false;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public double getBalance() {
        return this.balance;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString(){
        return "id: " + accountId + " balance: " + balance + " dateCreated: " + dateCreated;
    }

}
