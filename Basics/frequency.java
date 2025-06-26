public class frequency {//frequency count using array
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 4, 4, 4 };
        int num[] = new int[arr.length];
        boolean visted[] = new boolean[arr.length];
        System.out.print("Input : ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (visted[i])
                continue;
            int m = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                   visted[j] = true;
                    m++;

                }
            }

            
          
            num[k] = m;
           
            System.out.println( arr[i] + " :" + " "+ num[k] + "   " );
             k++;

        }

    
        }

    }

