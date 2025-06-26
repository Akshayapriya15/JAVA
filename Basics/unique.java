public class unique {
    public static void main(String[] args){
        int arr[] = { 1,2,2,3,3,4};
        System.out.print(" Input : ");
        for(int a : arr){
            System.out.println(a + " ");
        } 
        System.out.println();
        for(int i =0; i< arr.length;i++){
              boolean duplicate = false;
            for(int j =0; j < arr.length;j++){
                 if(i != j && arr[i] == arr[j])
                     duplicate = true;
                      break;
                 
            }
            if(!duplicate){
                System.out.println(arr[i]);
            }
        }

        }
        }
