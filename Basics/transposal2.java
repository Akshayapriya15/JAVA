public class transposal2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int row = arr.length;
        int col = arr[0].length;
        int[][] trans = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

    }
}

