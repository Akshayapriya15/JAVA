public class checker {
    int reverse = 0;

    public int palindrome(int num) {
        int original = num;
        while (num > 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
           
        }
        if (original == reverse) {
            System.out.print("palindorme : ");
        } else {
            System.out.print("Not a plaindrome : ");
        }
         return reverse;
    }
         

         


    public static void main(String[] args) {
        int number = 121;
        checker ch = new checker();
        System.out.println( ch.palindrome(number));
    }
}
