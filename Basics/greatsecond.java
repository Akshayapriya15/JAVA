public class greatsecond {
    public static void main(String[] args) {
        int num[] = {10,8,3,5};
        System.out.print("Input :");
            
        for (int a : num) {
            System.out.print(a + " ");
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
        System.out.println();
        System.out.print(" ascending order : ");
        for(int a : num)
        {
            System.out.print(a + " ");
        }
            }  
        }
     //   System.out.println();
       // System.out.print(" ascending order : ");
        //for(int a : num)
        //{
          //  System.out.print(a + " ");
        //}
        System.out.println();
        System.out.print("Greatest second no :");
                System.out.print(num[num.length - 2]);
    }
}

