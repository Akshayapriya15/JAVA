public class addition {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Matrix 1");
        for (int n[] : arr) {
            for (int value : n) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" Matrix 2");
        for (int n[] : arr1) {
            for (int value : n) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        int[][] add = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                add[i][j] = arr[i][j] + arr[i][j];
            }
        }
        System.out.println();
        System.out.println("Addition");
        for (int n[] : add) {
            for (int value : n) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}