import java.util.Scanner;
public class scannerm {
    public static void main(String[] args)

    {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][4];
        System.out.println("Enter the number 3 * 4 matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = in.nextInt();
            }
            System.out.println();
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", arr[i][j] , " ");
            }
            System.out.println();
        }


    }
    
}
