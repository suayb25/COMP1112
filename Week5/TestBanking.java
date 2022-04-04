import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestBanking {

    private static ArrayList<AccountHolder> allAccountHolders;
    private static AccountHolder currentAccHolder = null;
    private static Scanner scn;

    public static void main(String[] args) {
        Random rnd = new Random();
        int low = 11;
        int high = 19;
        int number = rnd.nextInt(high-low+1)+low;//11 and 19 included [11, 19]
        System.out.println(number);
        number = rnd.nextInt(high-low)+low;//11 (included) and 19 (not included) [11, 19)
        System.out.println(number);

        /*allAccountHolders = new ArrayList<>();
        scn = new Scanner(System.in);
        addAccountHolder();
        login();
        addAccount();
        addAccount();
        deposit();
        withdraw();
        transferBetweenAccount();
        displayAccountInfo();
        logout();*/
    }

    private static void addAccount() {
        if (currentAccHolder == null) {
            System.out.println("You have to login first!");
            return;
        }
        System.out.println("Please enter your initial balance? ");
        double init = scn.nextDouble();
        currentAccHolder.addAccount(init);
    }

    private static void addAccountHolder() {
        //Add scanner statements here, so that  the user can enter name, address, phone, and password.
        Random rnd = new Random();
        AccountHolder ah = new AccountHolder("name" + rnd.nextInt(100), "address"+rnd.nextInt(100), 123+rnd.nextInt(100), "1a2b3cde");
        allAccountHolders.add(ah);
        System.out.println("Your id is: " + ah.getId() + " please keep it in mind.");

    }

    private static void login() {
        System.out.println("Please enter your id: ");
        int id = scn.nextInt();
        System.out.println("Please enter your password: ");
        String pwd = new Scanner(System.in).next();
        for (int i = 0; i < allAccountHolders.size(); i++) {
            AccountHolder ach = allAccountHolders.get(i);
            if (ach != null) {
                if (ach.getId() == id) {//Why we are checking id? You can not check with name.
                    if (ach.login(pwd)) {
                        currentAccHolder = ach;
                        break;
                    }
                }
            }
        }
    }

    private static void deposit() {
        if (currentAccHolder == null) {
            System.out.println("You have to login first!");
            return;
        }
        System.out.println("Enter your account id, and the amount to be deposited.");
        int accId = scn.nextInt();
        double amount = scn.nextDouble();
        String returned = currentAccHolder.depositToAccount(amount, accId);
        System.out.println(returned);
    }

    private static void withdraw() {
        if (currentAccHolder == null) {
            System.out.println("You have to login first!");
            return;
        }
        System.out.println("Enter your account id, and the amount to be withdrawn.");
        int accId = scn.nextInt();
        double amount = scn.nextDouble();
        String returned = currentAccHolder.withdrawFromAccount(amount, accId);
        System.out.println(returned);
    }

    private static void transferBetweenAccount() {
        if (currentAccHolder == null) {
            System.out.println("You have to login first!");
            return;
        }
        System.out.println("Please enter the account id that you want to draw from: ");
        int accId = scn.nextInt();
        System.out.println("Please enter the account id that you want to deposit to: ");
        int accId2 = scn.nextInt();
        System.out.println("Please enter the amount to transfer: ");
        double amount = scn.nextDouble();
        System.out.println(currentAccHolder.transferBetweenAccounts(amount, accId, accId2));
    }

    private static void displayAccountInfo() {
        if (currentAccHolder == null) {
            System.out.println("You have to login first!");
            return;
        }
        System.out.println("Please enter the account id that you want to see the information of: ");
        int accId = scn.nextInt();
        currentAccHolder.displayAccount(accId);
    }

    private static void logout() {
        if (currentAccHolder == null) {
            System.out.println("You need to login before you logout!");
        } else {
            currentAccHolder = null;
            System.out.println("You logged out!");
        }
    }
}