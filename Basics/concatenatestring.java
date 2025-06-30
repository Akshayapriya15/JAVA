public class concatenatestring {
    public static void main(String[] args) {
        String[] str = { "java", "is", "a", "powerful" };
        String str1 = "";
        for (int i = 0; i < str.length; i++) {
            str1 = str1 + str[i];
        }
        System.out.println(str1);
    }
}
