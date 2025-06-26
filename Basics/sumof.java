public class sumof {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int num = 234;
        while (i < num) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
