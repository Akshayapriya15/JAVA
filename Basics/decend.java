public class decend {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 6 };
        System.out.print("Input : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println();
            System.out.print("output : ");
            for (int a : arr) {
                System.out.print(a + " ");
            }
        }
    }
}
