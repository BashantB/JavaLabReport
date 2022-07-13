public class Overloading {

    private static int sum(int a, int b) {
        return (a+b);
    }

    private static String sum(String s1, String s2) {
        return (s1+s2);
    }

    

    public static void main(String[] args) {
        System.out.println("Bahant Bist 019-322");
        System.out.println(sum(3, 4));
        System.out.println(sum("Bashant", "Bist"));
    }
}