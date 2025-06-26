public class spiral1 {
    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3,9},
                { 4, 5, 6,8},
                { 7, 8, 9,7}
        };
        int colstart = 0;
        int rowstart = 0;
        int colend = arr[0].length - 1;
        int rowend = arr.length - 1;
        while (rowstart <= rowend && colstart <= colend) {
            for (int col = colstart; col <= colend; col++) {
                System.out.print(arr[rowstart][col] + " ");
            }
            rowstart++;
            for (int row = rowstart; row <= rowend; row++) {
                System.out.print(arr[row][colend] + " ");
            }
            colend--;
            if (rowstart <= rowend) {
                for (int col = colend; col >= colstart; col--) {
                    System.out.print(arr[rowend][col] + " ");
                }
            
                rowend--;
            }
            if (colstart  <= colend) {
                for (int row = rowend; row >= rowstart; row--) {
                    System.out.print(arr[row][colstart] + " ");
                }
            
                colstart++;
            }
        }
    }
}
