public class armstrong {
    public static void main(String[] args) {
        int number = 123;
        int original = number;
        int digit;
        int sum = 0;
        int digits = number % 10;

        while (number > 0) {

            digit = number % 10;
             sum += (Math.pow(digit, digits));
            

            number = number / 10;

        }
        System.out.println(sum);
        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not a Amstrong");
       }
         
    }}
