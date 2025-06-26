public class merge {
    public static void main(String[] args) {
        int arr1[] = { 2, 3 };
        int arr2[] = { 4, 5 };
        int merge[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }
        for(int j =0; j< arr2.length;j++)
        {
            merge[arr1.length + j] = arr2[j];
        }
        System.out.println();
        System.out.print("merge[] =");
        for(int a : merge){
            System.out.print(a + " ");
        }
    }
}

