public class starf {
    public static void main(String[] args) {
        
    
        for (int row = 1; row <= 5; row++) {
            int col;
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
