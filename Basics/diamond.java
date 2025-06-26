public class diamond {
    public static void main(String[] args) {
        int row = 4;
       for(int i =0; i<row;i++)
        {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= i * 2; col++) {
                System.out.print("*");
         }
            System.out.println();
        }
        int rosw = 5;
        for (int i = rosw; i >=0; i--) {
            for (int j = 1; j <= rosw-i; j++) {
                System.out.print(" ");
            }
            for(int col = 1; col<=2*i-1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

