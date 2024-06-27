public class parsing {
    public static void main(String[] args) {
        String no = "987654321";
        int ans = Integer.parseInt(no);
        System.out.println(ans);

        String str = "true";
        boolean ans1 = Boolean.parseBoolean(str);
        System.out.println(ans1);

        String str2 = "abcd";
        char ch = str2.charAt(2);
        System.out.println(ch);
    }
}
