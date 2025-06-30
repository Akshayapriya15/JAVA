public class rotatebuil {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";
        String rotate = "";
         boolean check = true;
        for (int i = 0; i < str1.length(); i++) {
            rotate = str1.substring(i) + str1.substring(0, i);
           
            if (rotate.equals(str2)) {
                System.out.println("true");
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("false");
        }
        
           
      }
}


