public class duplicatestring {
    public static void main(String[] args) {
        String str = "programming";
        String str1 = "";
       
        for (int i = 0; i < str.length(); i++) {
             boolean dul = false;
             for (int j = i + 1; j < str.length(); j++) {
                 if (str.charAt(i) == str.charAt(j)) {
                     dul = true;
                 }
             }
                if (!dul) {
                    str1 = str1 + str.charAt(i);
                }
            
           
        }
        System.out.println(str1);

    }
}
