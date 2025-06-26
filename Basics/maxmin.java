

public class maxmin {
    public static void main(String[] args) {
        int[][] arr = {
            {1,8},
            {9,7}
        };
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
            
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                else if(arr[i][j] < min ){
                    min = arr[i][j];
                }



            }
        }

        System.out.println( "  maximum no  : " + max);
        System.out.println("minimun number : " + min);

    }}

