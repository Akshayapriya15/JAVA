public class reversal {
    public static void main(String[] args) {
        int number = 1234;
        int reverse = 0;
        
        do { 
            int digit = number % 10;
             reverse = reverse * 10 + digit;
             number = number / 10;
             
            
         } while (number > 0);
         System.out.println(reverse);
    }}

