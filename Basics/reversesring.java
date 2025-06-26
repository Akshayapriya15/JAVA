public class reversesring {
    public static void main(String[] args) {
        String str = "java";
        String str1 = "";

        for (int i = str.length()- 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i); // return  character at the specific index

        }
      
        System.out.println("the original String : " + str);
          System.out.println(" the reverse String " +str1);

    }
}
