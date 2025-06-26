public class anagramstring {
    public static void main(String[] args) {
        String str = "listen";
        String str2 = " silent";
       
        String c = "";
        StringBuilder b = new StringBuilder(str2);
        for (int i = 0; i < str.length(); i++) {
             boolean snow = false;
            for (int j = 0; j < b.length(); j++) {
                if (str.charAt(i) == b.charAt(j)) {
                    b.deleteCharAt(j);//j--
                    snow = true;
                    break;

                }
            }
            if (snow == true)
                c = c + str.charAt(i);

        }
        if (c.equals(str)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not a anagrams");
        }
    }}

