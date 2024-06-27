class Father {
    public void business() {
        System.out.println("My father is Businessman");
    }
}

class Son extends Father {
    public void student() {
        System.out.println("I am a Student");
    }
}

public class FatherSonDriver {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.student();
        s1.business();
        Father f1 = s1;
        f1.business();
    }
}