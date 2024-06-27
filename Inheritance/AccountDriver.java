// single level inheritance

class Account {
    String bank;
    String branch;
    long accno;
    String IFSC;
    String name;

    public Account() {
    }

    public Account(String bank, String branch, long accno, String IFSC, String name) {
        this.bank = bank;
        this.branch = branch;
        this.accno = accno;
        this.IFSC = IFSC;
        this.name = name;
        System.out.println("Account Created!");
    }

    public void displayAccount() {
        System.out.println("Bank : " + bank);
        System.out.println("Branch : " + branch);
        System.out.println("Acc No : " + accno);
        System.out.println("IFSc : " + IFSC);
        System.out.println("Name : " + name);
        System.out.println("----------------------");
    }
}

class SavingAccount extends Account {
    double bal;
    double interest;
    double limit;
    double min;

    public SavingAccount() {
    }

    SavingAccount(String bank, String branch, long accno, String IFSC, String name, double bal, double interest,
            double limit, double min) {
        this.bank = bank;
        this.branch = branch;
        this.accno = accno;
        this.IFSC = IFSC;
        this.name = name;

        this.bal = bal;
        this.interest = interest;
        this.limit = limit;
        this.min = min;

        System.out.println("Saving Account created!");
    }

    public void displaySavingAccount() {
        displayAccount();
        System.out.println("Balance : " + bal);
        System.out.println("Interest : " + interest);
        System.out.println("Limit : " + limit);
        System.out.println("Minimum balance : " + min);
    }
}

public class AccountDriver {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("SBI", "Murum", 987654321, "SBIN0020038", "Vishwajit", 100000, 5, 200000,
                2000);
        s1.displayAccount();
        s1.displaySavingAccount();

    }
}
