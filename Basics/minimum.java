public class minimum {
    public static void main(String[] args) {
        int num[] = { 7, 5, 9, 6, 4, 1 };
        int min = num[0];
        for (int i = 1; i < 6; i++) {
            if (num[i] < min)
                min = num[i];
        }
        System.out.println(min);

}

}
