public class reversestar {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(" ");
           }
            for (int col = 5; col >= i; col--) {
                System.out.print("*");
            }
            System.out.println();
        }        
    }}

