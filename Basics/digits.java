public class digits {
    public static void main(String args[]) {
        int num = 1234;
        int digits;
        int sum = 0;
        for(; num > 0;) {
            digits = num % 10;
            sum = sum + digits;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
