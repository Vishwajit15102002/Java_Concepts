public class Computer {
    String brand;
    String os;
    String processor;
    int ram;
    int rom;
    PenDrive p;

    public Computer() {
    }

    Computer(String brand, String os, String processor, int ram, int rom) {
        this.brand = brand;
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.rom = rom;
    }

    public void insertPenDrive(String name, int size, double price) {
        p = new PenDrive(name, size, price);
        System.out.println("Pendrive Inserted!");
    }

    public void displayComputer() {
        System.out.println("Brand : " + brand);
        System.out.println("ROM : " + rom);
        System.out.println("ROM : " + ram);
        System.out.println("OS : " + os);
        System.out.println("Processor : " + processor);
    }
}
