public class fibo {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        int next;
        System.out.print(" " +a );
        for (int i = 0; i < n; i++) {
          next = a + b;
          System.out.print(" "+next);
          b = a;
          a = next;
            
        }
    }
}
