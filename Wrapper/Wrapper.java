import javax.print.attribute.IntegerSyntax;

public class Wrapper {
    public static void main(String[] args) {
        Integer i1 = new Integer(22);
        System.out.println(i1); // boxing
        int i = i1.intValue(); // unboxing
        System.out.println(i);

        Character ch1 = new Character('y');
        System.out.println(ch1);
        char ch = ch1.charValue();
        System.out.println(ch);

        Integer a1 = 9;
        int a = a1;
        System.out.println(a);

        String str = String.valueOf(a);
        System.out.println(str);
        System.out.println((str));

        char ch2[] = { 'a', 'b', 'c', 'd' };
        String str1 = String.valueOf(ch2);
        System.out.println(str1);

        System.out.println(str.getClass());
    }
}
