public class palindromestatic {
    public  static boolean isPlaindrome(String str) {
        StringBuilder b = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            b.append(ch);
        }
        System.out.println(b);
         return str.equals(b.toString());
    }

    public static void main(String[] args) {
        //  palindromestatic obj1 = new palindromestatic();
        String name = "good";
         System.out.println( " plaindrome or not palindrome :" + isPlaindrome(name));
    }
}
