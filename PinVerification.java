import java.util.*;

public class PinVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 0;
        int activePin = 1234;
        do {
            System.out.println("Enter your Pin : ");
            int pin = sc.nextInt();
            if (pin == activePin) {
                System.out.println("Login Sucessfull!");
                break;
            }
            System.out.println("Password Incorrect ");
            attempt++;
        } while (attempt < 3);
        {
            if (attempt == 3) {
                System.out.println("Maximum attempt!");
            }
        }
    }
}