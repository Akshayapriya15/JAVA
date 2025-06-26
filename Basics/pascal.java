

public class pascal {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= i ; col++) {
                if (col == 0 || col == i ) {
                    System.out.print(" 1 " );
                }
                else if (i == 2 && col == 1)
                    System.out.print(" 2 ");
              else if (i == 3 && col == 1 || i == 3 && col == 2)
                  System.out.print(" 3 ");
                 else if (i == 4 && col == 1  || i==4 && col == 3)
                   System.out.print(" 4 ");     
                   
                   else if(i==4 && col ==2)
                       System.out.print(" 6 ");
                    else if(i == 5 && col == 1 || i==5 && col ==4)
                        System.out.print(" 5 ");
                    else if (i==5 && col == 2 || i==5 && col == 3)
                        System.out.print("10 ");
                  else
                    System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}
