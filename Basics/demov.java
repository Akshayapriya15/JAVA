public class demov {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 16, 20, 30 };
        int count = 1;
        for(int i =0;i<=arr.length -1; i++)
        {
            if (arr[i] != count) {
                while(arr[i] != count){
                    System.out.print(count + " ");
                    count++;
                }

            }
            count ++;
        }
    }
}
