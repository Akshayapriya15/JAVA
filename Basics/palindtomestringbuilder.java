public class palindtomestringbuilder {
    public static void main(String[] args) {
        String str = "aba";
        System.out.println("original String : " + str);
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() -1; i >= 0; i--) {
            sb.append(str.charAt(i));

        }
        System.out.println( "reverse String : " + sb.toString());
        if (str.equals(sb.toString()))
        {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
            
    }
}
