public class ascend {
    public static void main(String[] args) {
        int num1[] = {2, 4, 8, 3 ,};
        System.out.print("Input : ");
        for (int a : num1) {
            System.out.print(a + " ");
        }
        int temp;
        for (int i = 0; i <= num1.length - 1; i++) {
            for (int j = i + 1; j <= num1.length - 1; j++) {
               
                if (num1[i] > num1[j]) {
                    temp = num1[i];
                    num1[i] = num1[j];
                    num1[j] = temp;
                }
                
            }
        }
        System.out.println();
        System.out.print("output : ");
        for (int i = 0; i <= num1.length - 1; i++) {
            System.out.print(num1[i] +" ");
        }
        

    }}

