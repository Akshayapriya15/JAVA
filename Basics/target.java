public class target {
    public static void main(String[] args) {
        String str = "programming";
        char target = 'g';
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == target) {
                count++;
            }

        }
        System.out.println(target + ": " + count);

    }
}
