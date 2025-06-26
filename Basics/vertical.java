public class vertical {
    public static void main(String[] args) {
        int[][] arr ={
            {1,2,3},
            {4,5,6},
            {7,8,9}                
        };

        System.out.println("Original matrix");
        for (int n[] : arr) {
            for (int values : n) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
        int[][] flip = new int[arr.length][arr[0].length];
        int k = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            
            for (int j = 0; j < arr[0].length; j++) {
                
                flip[k][j] = arr[i][j];
            
            }
            k++;
        }

         System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(flip[i][j] + " ");
            }
            System.out.println();
        }

    }
}
