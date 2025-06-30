public class wordcountmanual {
    public static void main(String[] args) {
        String str = "java is powerful";
        int count = 0;
        boolean word = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                if (!word) {
                    count++;
                    word = true; // true until space is comming
                }
            } else {
                word = false;
            }

        }
        System.out.println("The oroginal input : " + str);
        System.out.println(count);
    }
}
