import java.util.Date;

/**
 *
 * @author talha
 */

public class Account {

    private double balance = 0;
    private Date dateCreated;

    // We can define more than one method with the same name in a class (Overloading)
    // Overloading occurs when two or more methods in one class have the same method name but different parameters.
    // We can create multiple methods of the same name in the same class, and all methods work in different ways.
    public Account() {
        this.dateCreated = new Date();
    }

    //An account can be created with specific amount of money.
    public Account(double money) {
        this.balance = money;
        this.dateCreated = new Date();
    }

    public double deposit(double money) {
        this.balance += money;
        return this.balance;
    }

    public double withdraw(double money) {
        this.balance -= money;
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
