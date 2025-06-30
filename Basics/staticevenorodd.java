import java.util.Scanner;
public class staticevenorodd {

        public static String checkevenorodd(int num){
            if(num % 2 == 0){
                return "even";
            }else{
                return "odd";
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
             System.out.println("even or odd :" + checkevenorodd(n));
        }
    }

