public class methodOverloading {
    public static void main(String[] args) {
        add('a', 'A');
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(char ch1, char ch2) {
        System.out.println(ch1 + ch2);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }
}
