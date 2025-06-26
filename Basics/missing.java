import java. util.Arrays;
public class missing {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 16, 20, 30 };
        Arrays.sort(arr);
       int count = 1;

    for(int i =0; i <=arr.length -1 ; i++){
        if(arr[i] == count){
            
        }
        else if (count != arr[i]) {
            System.out.print(count + " ");
            i--;
        }
        count++;
        }
        

    }
    }

