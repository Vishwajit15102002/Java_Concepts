class A {
    public void best() {
        System.out.println("Best");
    }

    public void worst() {
        System.out.println("Worst");
    }
}

class B extends A {
    public void worst() {
        System.out.println("Worst");
    }
}

public class ABDriver {
    public static void main(String[] args) {
        A a1 = new B();
        a1.best();
        a1.worst();
    }
}
