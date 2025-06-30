



public class dulplicatebuil {
    public static void main(String[] args) {
         String str = "banana";
         boolean[] seen = new boolean[256];
         StringBuilder b = new StringBuilder();
         for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
             if (!seen[ch]) { // instead of index value i am giving char as a value
                 seen[ch] = true;// seen[97] = true
                 b.append(ch);
             }
         }
         System.out.println(b.toString());
    }}

