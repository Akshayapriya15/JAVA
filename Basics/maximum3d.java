public class maximum3d {
    public static void main(String[] args) {
        int[][][] arr = {
            {{10,3},{4,5}},
            {{6,7},{8,9}}
        };
       // int max = arr[0][0][0];
        int max = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 for (int k = 0; k < arr[i][j].length; k++) {
                     if (max < arr[i][j][k]) {
                         max = arr[i][j][k];
                     }
                 }
             }
         }
            System.out.println("the maximum value is :" + max);
        
    }
}
