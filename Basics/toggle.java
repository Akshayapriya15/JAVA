public class toggle {
    public static void main(String[] args) {
        String str = "Ja& Va";
        str = str.replaceAll("\\s", "");
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
                if (ch == Character.toUpperCase(ch)) {
                    r.append(Character.toLowerCase(ch));
                } else if (ch == Character.toLowerCase(ch)) {
                    r.append(Character.toUpperCase(ch));
                } else {
                    r.append(ch);
                }
            
        }
        System.out.println(r.toString());
    }
}
