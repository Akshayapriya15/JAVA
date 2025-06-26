import java.util.Scanner;
public class display3d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][][] arr = new int[2][3][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = in.nextInt();
                }
            }
        }
        for (int i = 0; i < 2; i++) {
             System.out.println("Layer "+i + " ");
            for (int j = 0; j < 3; j++) {
               
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }


    }
}
