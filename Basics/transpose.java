class transpose {// i am reverseing but i wont wrong in 3 * 3
    public static void main(String[] args) {
        int[][] a = {
                { 1, 3 },
                { 2, 4 }
        };
        int temp = a[0][1];
        a[0][1] = a[1][0];
        a[1][0] = temp;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

