public class removewhitespace {
    public static void main(String[] args) {
        String str = "a b c\n d";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
