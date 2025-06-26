
import java.util.Arrays; 
 public class anagrams {
     public static void  main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
       //for(int i =0;i<arr1.length ;i++){
       // if(arr1[i] == arr2[i]){
       
            System.out.println("Anagrams");
        } else {
            System.out.println("Not a Anagrams");
        }

    }
    }

