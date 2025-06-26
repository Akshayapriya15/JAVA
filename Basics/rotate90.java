public class rotate90 {
    public static void main(String[] args) {
        int[][] arr = {
            { 1, 2, 3, 4 },
            { 4, 5, 6, 5 },
            { 7, 8, 9, 6 },
            { 4, 5, 6, 7 }
           
        };
        int[][] trans = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        for (int n[] : trans) {
            for (int value : n) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
         
        System.out.println();
        int rotate[][] = new int[trans.length][trans[0].length];
        int row = 0;
        for (int i = 0; i <= trans.length - 1; i++) {
            int col = 0;
            for (int j = trans[0].length - 1; j >= 0; j--) {
                rotate[row][col] = trans[i][j];
                col++;
            }
            row++;
          }
          System.out.println("rotate 90 degree : ");
          for (int n[] : rotate) {
              for (int value : n) {
                  System.out.print(value + " ");
              }
              System.out.println();
          }
    }
}
