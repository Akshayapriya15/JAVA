
public class d {
    public static void main(String[] args) {
        int row = 5;
        for (int i = row; i >= 0; i--) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= 2 * i-1; col++)
            {
                System.out.print("*");
            }
            System.out.println();
         }

    }
}
