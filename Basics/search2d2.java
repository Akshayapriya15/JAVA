import java.util.Scanner;
public class search2d2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {1,2,3},
            {15,17,19},
            {25,90,95}               
        };
        int target = sc.nextInt();
        boolean search = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.println(" element" +target +" found at index : " + i + "," + j);
                    search = true;
                    break;
                }
            }
        }
        if (!search) {
            System.out.println("Element not found  ");
        }
        sc.close();

    }
}
