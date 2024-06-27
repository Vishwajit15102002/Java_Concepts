import java.util.ArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(true);
        al1.add("Hello");
        al1.add(null);
        al1.add('d');
        al1.add(new Scanner(System.in));
        al1.add(1.1);
        System.out.println(al1);

        ArrayList shoes = new ArrayList();
        shoes.add("Nike");
        shoes.add("Puma");
        shoes.add("Adidas");
        shoes.add("Reebok");
        shoes.add("Campus");
        System.out.println(shoes);

    }
}
