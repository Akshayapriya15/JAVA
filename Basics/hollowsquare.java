public class hollowsquare {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= row; j++) {
                if ( i==0|| i == row|| j==0|| j==row) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}