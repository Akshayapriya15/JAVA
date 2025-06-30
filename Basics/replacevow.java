public class replacevow {
    public static void main(String[] args) {
        String str = "hello";
        String input = "";
       // char[] arr = str.toCharArray();
        //for (char ch : arr) {
              // for (char ch : str.toCharArray()) {
              for (int i = 0; i < str.length(); i++) {
                  char ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                input = input + "*";
            } else {
                input = input + ch;
            }

        }
        System.out.println(input);
    }

}