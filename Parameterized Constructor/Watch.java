// exaple for parameterized constructor

import java.rmi.StubNotFoundException;

class Watch {
    String brand;
    double price;
    String type;

    Watch() {
    }

    Watch(String brand, double price, String type) {
        this.brand = brand;
        this.price = price;
        this.type = type;

        System.out.println("Values Loaded !");
    }

    public void displayWatch() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Type : " + type);
    }
}
