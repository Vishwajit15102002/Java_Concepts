// multiple inheritance using interface

interface Jack {
    int rating = 86;

    void singing();

    void dancing();

    static void about() {
        System.out.println("From Jack!");
    }
}

interface Jill {
    int rating = 87;

    void playing();

    void dancing();

    static void about() {
        System.out.println("From Jill!");
    }
}

class Pill implements Jack, Jill {
    @Override
    public void dancing() {
        System.out.println("Hip-Hop");
    }

    @Override
    public void playing() {
        System.out.println("Handball");
    }

    @Override
    public void singing() {
        System.out.println("Classical");
    }
}

public class PillDriverMI {
    public static void main(String[] args) {
        Jill j1 = new Pill();
        j1.dancing();
        j1.playing();
    }
}
