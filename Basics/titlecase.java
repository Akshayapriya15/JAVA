public class titlecase {
    public static void main(String[] args) {
        String str = "my name is akshayapriya";
        boolean title = false;

        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (!title) {
                    str1 = str1 + Character.toUpperCase(ch);
                    title = true;
                    continue;

                }
                str1 =str1 + ch;
            } else {
                title = false;
                str1 = str1 + ch;
            }
            

        }
        System.out.println(str1);    }
}
