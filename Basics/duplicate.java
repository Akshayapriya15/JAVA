public class duplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 4 };
        System.out.print("original : ");
        for (int a : arr) {
            System.out.print(a + "");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(arr[i]);
            }
            
        }
    }
}