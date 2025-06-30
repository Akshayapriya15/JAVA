public class Appendstr {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = " is";
        String str3 = " powerful";
        StringBuffer sb = new StringBuffer();
        sb.append(str1).append(str2).append(str3);
        System.out.println(sb.toString());
    }
}
