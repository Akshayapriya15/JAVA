public class factorial {
    public static void main(String[] args) {
        int factorial= 1;
        int i = 1;
        int number = 5;
        while (i <= number) {
            factorial = factorial * i;
            System.out.println(factorial);
            i++;
        }

    }}
