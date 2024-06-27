public class ComputerDriver {
    public static void main(String[] args) {
        Computer c1 = new Computer("Lenovo", "Windows", "I5", 8, 512);
        c1.displayComputer();
        c1.insertPenDrive("Sony", 32, 500);
        c1.p.displayPenDrive();
    }
}
