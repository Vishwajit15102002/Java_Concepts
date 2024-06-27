public class BagDriver {
    public static void main(String[] args) {
        Bag b1 = new Bag();
        System.out.println(b1.brand);
        System.out.println(b1.color);
        System.out.println(b1.type);
        System.out.println(b1.waterproof);

        System.out.println("------------------");

        b1.brand = "HP";
        b1.color = "Black";
        b1.type = "laptop Bag";
        b1.waterproof = true;

        System.out.println("Brand : " + b1.brand);
        System.out.println("Color : " + b1.color);
        System.out.println("Type : " + b1.type);
        System.out.println("Waterproof : " + b1.waterproof);

    }
}
