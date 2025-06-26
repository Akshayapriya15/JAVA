public class newreverse {
    public static void main(String[] args) {
        int digit;
        int i = 0;
        int number = 1234;
        int sum = 0;
        while(i<number){
            digit = number % 10;//last diigit
            sum = sum * 10 + digit;
           //System.out.print(digit);
            number = number /10;
        }
        System.out.println(sum);
        }
    
}
