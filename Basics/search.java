public class search {
    public static void main(String[] args) {
        int[] num1 = { 17, 23, 89, 6, 9 };
        int num = 6;
        boolean found = false;
        for (int i = 0; i < num1.length; i++) {
            if (num == num1[i]) {

                found = true;
            }

        }
        if (found) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }
        
    }
}
