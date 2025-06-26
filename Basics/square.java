public class square {
     public static void main(String[] args) {
         int n = 5;
         int squar;
         int b = 2;
         for (int i = 1; i <= n; i++) {
             squar = (int) Math.pow(i, b);
             // double square = Math.pow(i,b);
             System.out.print(" " + squar);
         }
     }
}
