class A {
    int a = 5;

    public void displayA() {
        System.out.println("Printing details of class A (Super class, Base class)");
        System.out.println(a);
    }
}

class B extends A {
    char ch = 'Z';

    public void displayB() {
        System.out.println("Printing details of class B (Sub class, derived class)");
        System.out.println(ch);
    }
}

public class ABDriver {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);
        a1.displayA();

        B b1 = new B();
        b1.displayB();
        b1.displayA();
    }
}
