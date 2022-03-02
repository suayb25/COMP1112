/**
 *
 * @author talha
 */

public class testAccount {
    public static void main(String[] args) {
        Account a1 = new Account(123456);
        Account a2 = new Account(1000);
        System.out.println("a1= " + a1);
        System.out.println("a2= " + a2);
        a1 = a2;//You are setting references of a2 into a1. When you call a1, it will call a2. Because a1 has a2's memory reference.
        System.out.println("---------------");
        System.out.println("a1= " + a1);
        System.out.println("a2= " + a2);
        a1.withdraw(100);
        System.out.println("---------------");
        System.out.println("a1= " + a1);
        System.out.println("a2= " + a2);
        a2.deposit(500);
        System.out.println("---------------");
        System.out.println("a1= " + a1);
        System.out.println("a2= " + a2);
    }
}
