public class printdia2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int n[] : arr) {
            for (int value : n) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println(" Primary diagonal : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
        System.out.println("Secondary diagonal : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i][2 - i] + " ");
        }
    }
}
