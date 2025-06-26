public class maximum {
    public static void main(String[] args) {
        int num[] = { 4, 6, 8, 1, 9, 5 };
        int max = num[0];
        for (int i = 1; i < 6; i++) {
            if (num[i] > max)
                max = num[i];
        }
        System.out.println(max);
    }
}
