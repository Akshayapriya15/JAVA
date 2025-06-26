public class palstring {
    public static void main(String[] args) {
        String str = "abcba";
        // String str1 = "";
        //for (int i = str.length() - 1; i >= 0; i--) {
        //  str1 = str1 + str.charAt(i);
        // }
        // System.out.println("the original string is : " + str);
        //System.out.println("the reverse string is : " + str1);
        //if (str.equals(str1)) {
        //  System.out.println("palindrome");
        // } else {
        //   System.out.println("Not a palindrome");
        // }
        str.toLowerCase();
        boolean pal = false;

        for (int i = 0; i < (str.length() / 2); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                pal = true;
            }
        }
            if (!pal) {
                System.out.println("palindrome");
            } else {
                System.out.println("Not a plaindrome");
            }
        
    }
}