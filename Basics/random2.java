public class random2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        
        }
          

        System.out.println();
        for (int a[] : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println("");
        }
    }
}
