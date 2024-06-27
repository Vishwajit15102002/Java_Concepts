interface I1 {
    public static final String s = "QSpider";
    String s2 = "JSpiders";
    static int a = 10;

    void test();

    public void demo();

    public abstract void demo2();
}

class I1Imp implements I1 {
    public void test() {
        System.out.println("From overriding method test()");
    }

    public void demo() {
        System.out.println("For overriding method demo()");
    }

    public void demo2() {
        System.out.println("For overriding method demo2()");
    }

}

public class I1Driver {
    public static void main(String[] args) {
        I1 i = new I1Imp();
        i.test();
        i.demo();
        i.demo2();
        System.out.println(I1.s);
    }
}