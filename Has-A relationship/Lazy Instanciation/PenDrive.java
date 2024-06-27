public class PenDrive {
    String name;
    int size;
    double price;

    public PenDrive() {
    }

    PenDrive(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public void displayPenDrive() {
        System.out.println("Brand : " + name);
        System.out.println("Size : " + size);
        System.out.println("Price : " + price);
    }
}
