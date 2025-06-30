public class palstatic {
    public static void main(String[] args) {
        String str = "aabac";
        System.out.println("plaindrome : " + palstatic.pal(str));

    }

    public static boolean pal(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
           s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);
            if (start != end) {
                return false;// if this return execute it wont go to next return exit the block
            }
        }
        return true;
    }
}
