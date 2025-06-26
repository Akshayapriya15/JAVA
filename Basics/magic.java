public class magic {
    public static void main(String[] args) {
      int[][] arr = {
        {2, 9, 6},
        {9, 5, 1},
        {4, 3, 8}
      };
      boolean magic = false;
           int res = 0;
          int j =0;
          for (int i = 0; i < arr.length; i++) {
              res = res + arr[i][j];
              j++;
          }
          System.out.println(" sum of right  diagonal :" + res);
          System.out.println();
          int col = 0;
          int dia = 0;
          for (int i = arr[0].length - 1; i >= 0; i--) {
              dia = dia + arr[col][i];
          }
        System.out.print(" sum of left diagonal :" + dia);
          System.out.println();
          int row = 0;
          for (int i = 0; i < arr.length; i++) {
              for (int k = 0; k < arr[0].length; k++) {
                  row = row + arr[i][k];
              }
              if (row != dia) {
                  magic = true;
                  break;
              }
              row = 0;
          }
              int result = 0;
              for (int i = 0; i < arr.length; i++) {
              for (int k = 0; k < arr[0].length; k++) {
                  result= result + arr[k][i];
              }
              if (result != dia) {
                  magic = true;
                  break;
              }
              result = 0;
          }
          


          System.out.println();
          if (!magic && dia == res) {
              System.out.println("It is a magic square");
          } else {
              System.out.println("not a magic square");
          }
              
          }

    }

