public class demod {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,4};
        int num[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {

                num[k] = arr[i];
                k++;

            }
        }
            for (int i = 0; i < k;i++) {
                System.out.print( num[i] + " ");
            }

        
    }
}
