public class palindromearray {
    public static void main(String[] args) {
        int num[] = { 1,2,3,4};
       int arr[] = new int[num.length];

        System.out.print(" Original : ");

        for (int a : num) {
            System.out.print(a + "  ");
        }
        System.out.println();
        int j = 0;
        
        for (int i = num.length - 1; i >= 0; i--) {
            arr[j] = num[i];
            j++;
        }
          System.out.print(" Reverse  palindrome : ");

          for (int a : arr) {
              System.out.print(a + "  ");
          }
            

          boolean palindrome = false;
          for (int i = 0; i < arr.length - 1; i++) {
              if (arr[i] != num[i]) {
                  palindrome = true;
                  break;

              }
          }
          System.out.println();
    if(!palindrome) {
        System.out.println("palindrome");
    } else {
        System.out.println("Not a palindrome");
    }

        }


    }

