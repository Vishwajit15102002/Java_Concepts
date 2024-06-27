abstract class Dell {
    public Dell() {
        super();
    }

    public abstract void OS();

    public void welcome(String name) {
        System.out.println("Hii "
                + name + " Welcome to the Dell University");
    }
}

class Windows extends Dell {
    public void OS() {
        System.out.println("Windows OS System");
    }
}

class Linux extends Dell {
    public void OS() {
        System.out.println("Linux OS System");
    }
}

public class DellDriver {
    public static void main(String[] args) {
        Dell d1 = new Windows();
        d1.welcome("Vishwajit");
        d1.OS();

        Dell d2 = new Linux();
        d2.welcome("Vishwajit");
        d2.OS();
    }
}
