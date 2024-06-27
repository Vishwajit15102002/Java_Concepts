import java.util.*;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of array : ");
            int size = sc.nextInt();
            int[] nums;
            if (size > 0) {
                nums = new int[size];
                System.out.println("Array crated of " + size + " size");
            } else {
                nums = null;
            }
            System.out.println("Enter the elements of array : ");
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println("Elements added!");
            System.out.println("Enter the numerator index : ");
            int numerator = sc.nextInt();
            System.out.println("Enter the denominator index : ");
            int denominator = sc.nextInt();
            int res = nums[numerator] / nums[denominator];
            System.out.println(res);
        } catch (NullPointerException a) {
            System.out.println("Enter the size greater than zero");
        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Give the index between -1<i<nums.length");
        } catch (ArithmeticException a) {
            System.out.println("Dont divide a number by zero");
        } catch (NegativeArraySizeException a) {
            System.out.println("The size of the array should be greater than or equals to zero");
        }
    }
}