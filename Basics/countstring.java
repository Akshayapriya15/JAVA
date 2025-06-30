public class countstring {
    public static void main(String[] args) {
        String str = "java is powerful";
        String[] str1 = str.split(" ");
        int count = 0;
        for(int i =0; i < str1.length;i++)
        {
            System.out.println(str1[i]);
            count++;
        }
        System.out.println(count);
    }}

