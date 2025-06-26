public class reversejagged {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 3 },
                { 4, 5, 6, 1 },
                { 7, 8, 9 }
        };

        for (int n[] : arr) {
            for (int values : n) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("row"+(i+1)+ " = ");
            for (int j = arr[i].length-1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}