public class indexofstring {
    public static void main(String[] args) {
        String ch = "java";
    for(int i = 0;i<ch.length();i++)
    {
        char s = ch.charAt(i);
        System.out.println(ch.indexOf(s));
    }
}
}