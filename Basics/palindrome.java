public class palindrome {
    public static void main(String[] args){
        int number = 123;
        int reverse = 0;
        int original = number;
        int i = 0;
        int digit;
        while(i<number)
        {
            digit = number % 10;
            reverse = reverse * 10 + digit; // print(digit)
            number = number / 10;
        }
        System.out.println(reverse);
        if (reverse == original) {
            System.out.println("palindrome");

        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
 