public class menu {
    public static void main(String[] args) {
         char choice = 'y';
         do {
             int num1= 5;
             int num2= 6;
             char operator = '*';
             int iteration = 1;
             
             int result = switch (operator) {
                            
                case '+' ->num1 + num2;
                case '-'-> num1 - num2;
                case '*' ->num1 * num2;
                case '/' ->{
                    if(num1 != 0)
                       yield num1 / num2;
                   else    
                       System.out.println("invalid operator");
                      yield 0;
                  }
                 case '%' -> num1 % num2;
                 default -> 0;
             };
             System.out.println(result);
              
            
             if(iteration  < 1)
             choice = 'y';
            
             else  
                 choice = 'n';
             iteration++;
    
             } while (choice == 'y'|| choice == 'Y');
    }
}