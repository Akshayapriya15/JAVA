public class rotatestring {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "deabc";
        if (A.length() != B.length()) {
            System.out.println(false);
        }else{
            String combined = A + A;
            boolean result = combined.contains(B);
            System.out.println(result);
        }           
    }}
