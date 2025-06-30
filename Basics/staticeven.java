public class staticeven {
    public static void evenodd(int number) {
        if (number % 2 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String ar[]) {
        evenodd(20);
        evenodd(5);
    }
}
