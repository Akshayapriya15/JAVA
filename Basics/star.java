public class star {
    public static void main(String[] args) {

        int row = 5;
      
        while (row > 0) {
             int col = 0;
            while (col <= row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
             
            row--;
        }
    }
}

