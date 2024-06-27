// this is the example of method chaining

class Fruits {
    String name;
    double price;
    String color;
    String taste;

    public Fruits displayName() {
        System.out.println(name);
        return this;
    }

    public Fruits displayPrice() {
        System.out.println(price);
        return this;
    }

    public Fruits displayTaste() {
        System.out.println(taste);
        return this;
    }
}
