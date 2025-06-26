

public class understand1 {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2,5 };
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i : arr){
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second && i != first) {
                second = i;
            }

        }
        System.out.println( " first largest no : " +first);
        
        System.out.print("SECOND LARGEST NO :" + second);
    }
}
