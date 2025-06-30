public class duplistringarray {
    public static void main(String[] a) {
        String[] arr = { "apple", "banana", "apple", "orange" };
        boolean[] b = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (b[i]) {
                continue;
                
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    b[j] = true;
                    break;
                }
            }
            System.out.print(arr[i] + " ");
        }


    }
}
