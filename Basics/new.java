class neww{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.print("original array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
        System.out.println();
        System.out.print("reverse array : ");
        for(int sum : arr )
            System.out.print(sum + " ");
  }
}