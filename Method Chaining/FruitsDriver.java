class FruitsDriver {
    public static void main(String[] args) {
        Fruits f1 = new Fruits();
        f1.name = "Mango";
        f1.price = 250;
        f1.color = "Yellow";
        f1.taste = "Sweet";

        f1.displayName().displayPrice().displayTaste();
    }
}
