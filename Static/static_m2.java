public class static_m2 {

    public static void main(String[] args) {
        System.out.println("static method from different class with class name as refrence");
        static_m1.test();
        System.out.println(static_m1.a);
    }
}
