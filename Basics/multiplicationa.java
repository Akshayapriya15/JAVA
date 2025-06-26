public class multiplicationa {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2 },
                { 4, 5 }
        };

        int[][] arr1 = {
                { 1, 2},
                { 4, 5}
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
        int[][] mul = new int[arr.length][arr[0].length];
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    mul[i][j] = mul[i][j] + arr[i][k] * arr1[k][j];
               }
            }
        }
        System.out.println();
        System.out.println(" Multiplication");
        for (int n[] : mul) {
            for (int value : n) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
