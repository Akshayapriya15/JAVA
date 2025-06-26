public class symmetric {
    public static void main(String[] args){
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {3,5,6}                
        };

        System.out.println("original matrix: ");
        
        for (int row[] : arr) {
            for (int values : row) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
        System.out.println();
        int trans[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        System.out.println("transpose matrix : ");
        for (int row[] : trans) {
            for (int values : row) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
        boolean number = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (trans[i][j] != arr[i][j]) {
                    number = true;
                    break;
                }
            }
        }
            if (!number) {
                System.out.println("Symmetric");
            } else {
                System.out.println("Not a Symmetric");
            }
        
    }
}
