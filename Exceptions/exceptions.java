import java.util.*;

public class exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        try {
            int ans = a / b;
            System.out.println(ans);
        } catch (ArithmeticException r) {
            System.out.println("Dont divide by zero");
        }
        System.out.println("Done!");
    }
}
