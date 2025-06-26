public class newop {
    public static void main(String[] args) {
        char operator ='*';
        int num1 = 0;
        int num2 = 15;
        int result;
        result = switch(operator) {
         case '+'-> num1 + num2;
         case '-' ->num1 - num2;
         case'*' ->{
            if(num1 != 0&& num2!=0)
                  yield num1 * num2;
             else
                 System.out.println("invalid value");
                 yield 0;
         }     
            
            case '/' ->{
              if(num1 != 0&& num2!=0)
                  yield num1 / num2;
               else
                 System.out.println("invalid value");
                 yield 0;
         }     
         
            default -> 0;
        };
        System.out.println(result);
    }
}
