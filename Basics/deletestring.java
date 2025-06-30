public class deletestring {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(9);
        sb.delete(0, 5);
        System.out.println(sb.toString());
    }
}
