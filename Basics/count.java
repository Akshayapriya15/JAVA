public class count {
    public static void main(String[] args) {

        int number = 98564;
        int count = 0;
        int i=0;
        while (i<number) {
            number = number / 10;
            count++;

        }
        System.out.println(count);
    }
}