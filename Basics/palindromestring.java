public class palindromestring {
    public static void main(String[] args) {
        String str = "abcAB";
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        System.out.println("the original String : " + str);
        System.out.println("the reverse string : " + str1);
        boolean palindrome = false;
        for (int i = 0; i < str1.length()-1; i++) {
            if (str.charAt(i) != str1.charAt(i)) {
                palindrome = true;
                break;
            }
        }
        if (!palindrome) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
         }
    }}

