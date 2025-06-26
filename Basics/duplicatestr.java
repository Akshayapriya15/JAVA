public class duplicatestr {
    public static void main(String[] args) {
        String str = "progrramming";
        String c = "";
        StringBuilder b = new StringBuilder(str);
        for (int i = 0; i < b.length(); i++) {
            for (int j = i + 1; j < b.length(); j++) {
                if (b.charAt(i) == b.charAt(j)) {
                    b.deleteCharAt(j);
                    j--;
                    
                }
            }
            c = c + b.charAt(i);
        }
        System.out.println(c);
    }
}
