public class sumofrow {
    public static void main(String[] args) {
       // int[][] arr = {
         //   {1,2,3},
           // {4,5,6},
           // {7,8,9}        
           // };
           int[][] arr = new int[3][3];
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                   arr[i][j] = (int) (Math.random() * 10);
               }
           }
           for (int row[] : arr) {
               for (int value : row) {
                   System.out.print(value + " ");
               }
               System.out.println();
           }
           System.out.println();
        System.out.print("Sum of row : ");
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
               for (int j = 0; j < arr[i].length; j++) {
                  sum = sum + arr[i][j];
            }
                System.out.print(sum + " ");

        }
        System.out.println();
        System.out.print("Sum of column : ");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[j][i];
            }
            System.out.print(sum + " ");
        }
    }}

