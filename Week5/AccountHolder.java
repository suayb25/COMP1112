import java.util.ArrayList;

public class AccountHolder {

    private int id;
    private String name;
    private String address;
    private int phone;
    private static int count;
    private Password pwd;
    private ArrayList<BankAccount> myAccounts;

    public AccountHolder(String name, String address, int phone, String pass) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.id = count;
        this.count++;
        //this.id = count++; //does the same functionality as the upper 2 lines
        this.pwd = new Password(pass);//validation checking in Password class
        myAccounts = new ArrayList<>();
    }

    public void addAccount(double iBalance) {
        BankAccount ba = new BankAccount(iBalance);
        System.out.println("Your bank account id is : " + ba.getAccountId());
        myAccounts.add(ba);//You can have one or more accounts
    }

    public void displayAccount(int accId) {
        BankAccount ba = findAccountWithGivenId(accId);
        if (ba != null) {
            System.out.println(ba.toString());
        } else {
            System.out.println("There is no such account with id " + accId);
        }
    }

    private BankAccount findAccountWithGivenId(int accId) {
        BankAccount bankAccount = null;
        for (int i = 0; i < myAccounts.size(); i++) {
            BankAccount temp = myAccounts.get(i);
            if (temp != null) {
                if (temp.getAccountId() == accId) {
                    bankAccount = temp;
                    break;
                }
            }
        }
        return bankAccount;
    }

    public String depositToAccount(double amount, int accId) {
        BankAccount ba = findAccountWithGivenId(accId);
        String returnStr = "";
        if (ba == null) {
            returnStr = "There is no such account with id " + accId;
        } else {
            ba.deposit(amount);
            returnStr = "deposit completed";
        }
        return returnStr;
    }

    public String withdrawFromAccount(double amount, int accId) {
        BankAccount ba = findAccountWithGivenId(accId);
        String returnStr = "";
        if (ba == null) {
            returnStr = "There is no such account with id " + accId;
        } else {
            if (ba.withdraw(amount)) {
                returnStr = "you have withdrawn " + amount;
            } else {
                returnStr = "sorry, your balance is not enough";
            }
        }
        return returnStr;
    }

    public boolean login(String pas) {
        return pwd.login(pas);
    }


    public String displayInformation() {
        return "AccountHolder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", pwd=" + pwd +
                ", myAccounts=" + myAccounts +
                '}';
    }

    public void changePass(String newPwd) {
        //pwd = new Password(newPwd);
        pwd.resetPassword(newPwd);
    }

    public String transferBetweenAccounts(double amount, int fromAcc, int toAcc) {
        BankAccount from = findAccountWithGivenId(fromAcc);
        if (from == null) {
            return "There is no such account with id " + fromAcc;
        }
        BankAccount to = findAccountWithGivenId(toAcc);
        if (to == null) {
            return "There is no such account with id " + toAcc;
        }
        if (from.transfer(amount, to)) {
            return "you have transferred " + amount;
        } else {
            return "sorry you dont have enough balance";
        }
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int newPhone) {
        this.phone = newPhone;
    }

}

