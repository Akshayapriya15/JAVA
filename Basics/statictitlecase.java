

public class statictitlecase {
    public static void main(String[] args) {
        String s = "java is fun";
        String result = titlecasest(s);
        System.out.println("titleccase : " + result);

    }

    public static String titlecasest(String str) {
        StringBuilder b = new StringBuilder();
        String str1[] = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            b.append(Character.toUpperCase(str1[i].charAt(0))).append(str1[i].substring(1)).append(" ");
        }
        return b.toString();
        
    }
}