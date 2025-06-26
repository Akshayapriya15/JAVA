public class pascalt {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");

            }
            int num = 1;
            for (int col = 0; col <= i; col++){
                System.out.print(num + " ");
                // num = num + 1;
                num = num * (i - col)/(col + 1);
            }
           
         System.out.println();

        }
       
        
    }
}
