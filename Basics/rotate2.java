public class rotate2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int temp = arr[0];
        int temp1 = arr[1];
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = arr[i + 2];
        }
        arr[arr.length - 2] = temp1;
        arr[arr.length - 1] = temp;
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

}
