import java.util.Scanner;
public class jaggedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];
 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int n[] : arr) {
            for (int values : n) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
    }    
}
