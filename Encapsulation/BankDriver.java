public class BankDriver {
    public static void main(String[] args) {
        Bank b1 = new Bank("SBI", 123456789, "SBIN0020038", "Murum", "Ajay", 100000.00, "Savings", 9876543211l);
        System.out.println(b1.getBal(3234234));
        System.out.println(b1.getbankName());
        b1.withdraw(100.00, 123456789);
        b1.deposit(123456789, 2000);
    }
}
