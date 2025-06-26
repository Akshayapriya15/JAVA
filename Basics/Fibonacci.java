public class Fibonacci {
    public static void main(String[] args) {
        int n = 7; // Number of terms
        int a = 0, b = 1;
        int i = 0;
        System.out.print(a + " "); // Print first two terms
        while (i < n) {
            int next = a + b;
            System.out.print(next + " ");
            b = a;
            a = next;
        
            i++;
        }
    }
}      
   
        
