public class replacevowel {
    public static void main(String[] args) {
        String str = "Akshayapriya is a good girl";
        System.out.println("the original string : " + str);
        str = str.toLowerCase();
        for(int i =0; i < str.length();i++){
            char ch = str.charAt(i);
          //  if (Character.isLetter(ch)) {
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' -> System.out.print("*");
                    default -> System.out.print(ch);
                }
           // }
        }
    }
}
