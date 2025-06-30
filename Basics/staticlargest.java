public class staticlargest {
    public  static int largest(int n1 ,int n2, int n3){
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    } 
    public static void main(String[] ar) {
        int result  = largest(10,7,6);

        System.out.println("largest : " + result);
    }
}
