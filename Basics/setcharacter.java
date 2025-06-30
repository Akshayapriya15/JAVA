public class setcharacter {
    public static void main(String[] args) {
        String str = "java";
      StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(0, 'J');
        System.out.println(sb.toString());
    }}

