import java.util.ArrayList;
import java.util.*;

class Pen {
    String brand;
    double price;
    String type;
    String color;

    public Pen() {
    }

    Pen(String brand, double price, String type, String color) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.color = color;
    }

    public String toString() {
        return "[Brand = " + brand + ", Color = " + color + "]";
    }
}

class Pencil {
    String brand;
    double price;
    String type;
    String color;

    public Pencil() {
    }

    Pencil(String brand, double price, String type, String color) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.color = color;
    }

    public String toString() {
        return "[Brand = " + brand + ", Color = " + color + "]";
    }

}

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(new Pen("Cello", 10, "Gel", "Blue"));
        a1.add(new Pen("Hauser", 10, "Gel", "Black"));
        a1.add(new Pencil("Natraj", 5, "2HB", "Black"));
        a1.add(new Pencil("Apsara", 5, "Extra Dark", "Blue"));
        System.out.println(a1);
        for (int i = 0; i < a1.size(); i++) {
            if (a1.get(i) instanceof Pen) {
                Pen p1 = (Pen) a1.get(i);
                if (p1.color.equalsIgnoreCase("Black")) {
                    System.out.println("Remove" + p1);
                    a1.remove(p1);
                }
            } else if (a1.get(i) instanceof Pencil) {
                Pencil p1 = (Pencil) a1.get(i);
                if (p1.brand.equalsIgnoreCase("Natraj")) {
                    System.out.println("remove" + p1);
                    a1.remove(p1);
                }
            }
        }
        System.out.println(a1);
    }
}
