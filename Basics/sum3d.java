public class sum3d {
    public static void main(String[] args) {
        int arr[][][] = {
           { {2,3,4}, {2,3,4} },
           { {2,3,4}, {2,3,4} }       
        };
        int layernum = 0;
        for (int n[][] : arr) {
            System.out.println("layer  : " + layernum );
            for (int k[] : n) {
                for (int values : k) {
                    System.out.print(values + " ");
                }
                System.out.println();
            }
            layernum++;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    sum = sum + arr[i][j][k];
                }

            }
        }
        System.out.println("The sum is : " + sum);
        

    }
}
