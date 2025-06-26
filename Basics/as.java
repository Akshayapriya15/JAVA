import java.util.Arrays;
 class as {
     public static void main(String[] args) {
        int arr[][] = {
            {3,2,1},
            {6,7,8},
            {10,11,9}            
        };
        for (int i = 0; i < arr.length; i++) 
            Arrays.sort(arr[i]);
       
      

        for (int n[] : arr)
        {
            for (int values : n) {
                System.out.print(values + " ");
            }
            System.out.println();
            }
}

}
