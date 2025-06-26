public class sumjagged {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("The input is");

          for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[i].length; j++) {
                  System.out.print(arr[i][j] + " ");
              }
              System.out.println();
         }   
         System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            sum = sum + arr[i][j];
            }
        }
       System.out.println( " the sum of jagged array is " +sum);
    }    
}


