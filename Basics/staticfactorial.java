public class staticfactorial {
    public static int factorial(int number) {
        int n = 1;
        for (int i = 1; i <= number; i++) {
            n *=  i;

        }
        return n;
    }

    public static void main(String[] args) {
        
        System.out.println("factorial : " + factorial(5));
        
    }
}
