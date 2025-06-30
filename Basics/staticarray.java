public class staticarray {
    static int[] arr = new int[5];
    static {
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;//for loop 
        arr[4] = 5;
    
    }
    public static void main(String[] args) {
        for(int s : arr){
            System.out.print(s + " ");
        }
    }
}
