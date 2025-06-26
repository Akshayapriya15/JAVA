public class averagejagged {
    public static void main(String[] args) {
        int[][] arr = {
            {2,3},
            {4,5,6,1},
            {7,8,9}       
        };

        for (int n[] : arr) {
            for (int values : n) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
        double sums;
       

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
           //  int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
              //  count++;
            }
              sums = (int) (sum / arr[i].length); //count
            System.out.println("row" + i + "=  " +sums);
        }
    }
}
