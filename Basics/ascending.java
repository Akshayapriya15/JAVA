public class ascending {
    public static void main(String[] args) {
        int[] num = { 1, 4, 5, 3 };
        System.out.print("input :");
        for (int a : num) {
            System.out.print(a + " ");
        }

        System.out.println();

        int end = num.length - 1;
        int temp;
        for (int start = 0; start < end; start++) {
            if (num[start] > num[end]) {
                temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                end--;
            }
            // wrong sum looping is perfect

            System.out.println();
            System.out.print("output :");
            {
                for (int i = 0; i < num.length; i++) {
                    System.out.print(num[i] + " ");
                }
            }
        }
    }
}