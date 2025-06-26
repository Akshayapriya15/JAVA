public class operatorc {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 9;
        char operator = '/';
        switch (operator) {
            case '+':
                System.out.println("output:" + (num1 + num2));
                break;
            case '-':
                System.out.println("output:" + (num1 - num2));
                break;
            case '*':
                System.out.println("output:" + (num1 * num2));
                break;
            case '/':
                if(num1 != 0 && num2 != 0)
                    System.out.println("output:" + (num1 / num2));
                else
                    System.out.println("print valid number");
                break;
            case '%':
                 if(num1 != 0 && num2 != 0)
                     System.out.println("output:" + (num1 % num2));
                 else
                     System.out.println("print valid number");
                break;
            case '^':
                System.out.println("output:" + (num1 ^ num2));
                break;
            default:
                System.out.println("Enter correct operator:");

        }
    }
    }
