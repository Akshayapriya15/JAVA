public class nonrepeat {
    public static void main(String[] args) {
        String str = "swiss";
        StringBuilder str2 = new StringBuilder();
        char[] ch = str.toCharArray();
         
        for (int i = 0; i < ch.length; i++) {
            boolean check = false;
            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    check = true;
                    break;

                }

            }
            if (!check) {
                str2.append(ch[i]);

            }
        }
    
          System.out.println(str2 + " ");
    
        System.out.println(str2.length() + " ");
    }
}
