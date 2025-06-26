public class vowelsstring {
    public static void main(String[] args) {
        String str = "hello aksha3a";
        str.toLowerCase();
        int vowel = 0;
        int consonance = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' -> vowel++;
                    default -> consonance++;
                }
            }
        }
            System.out.println(" vowels  : " + vowel);
            System.out.println("consonance : " + consonance);

        
    }
}