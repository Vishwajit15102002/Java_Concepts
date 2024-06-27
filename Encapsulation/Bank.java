// example for encapsulation

public class Bank {
    private String bank;
    private long accno;
    private String ifsc;
    private String branch;
    private String name;
    private double bal;
    private long phno;
    private String type;

    public Bank() {
    }

    public Bank(String bank, long accno, String ifsc, String branch, String name, double bal, String type, long phno) {
        this.bank = bank;
        this.accno = accno;
        this.ifsc = ifsc;
        this.branch = branch;
        this.name = name;
        this.bal = bal;
        this.type = type;
        this.phno = phno;
    }

    public String getbankName() {
        return bank;
    }

    public String getIFSC() {
        return ifsc;
    }

    public String getBranch() {
        return branch;
    }

    public String getName() {
        return name;
    }

    public double getBal(long accno) {
        if (this.accno == accno) {
            return bal;
        } else {
            System.out.println("Invalid Credentials!");
            return 0;
        }
    }

    public void withdraw(double amount, long accno) {
        if (this.accno == accno) {
            if (amount > 0 && (bal - amount) >= 2000) {
                bal = bal - amount;
                System.out.println("Amount Debited!");
                System.out.println("Your Balance : " + bal);
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Inavlid Credentials!");
        }
    }

    public void deposit(long accno, double amount) {
        if (this.accno == accno) {
            if (amount > 0) {
                bal += amount;
                System.out.println("Amount credited");
                System.out.println(bal);
            } else {
                System.out.println("Invalid Amount");
            }
        } else {
            System.out.println("Invalid Credentials");
        }
    }

    public String getType() {
        return type;
    }

    public long phno() {
        return phno;
    }

}