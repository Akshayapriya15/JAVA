public class wordfrequency {
    public static void main(String[] args) {
        String[] arg = { "apple", "banana", "apple", "banana", "orange", "apple" };
        boolean arr[] = new boolean[arg.length];
        for (int i = 0; i < arg.length; i++) {
            if (arr[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arg.length; j++) {
                if (arg[i].equals(arg[j])) {
                    arr[j] = true;
                    count++;

                }

            }
            System.out.println(arg[i] + " " + count + " ");
        }
    }
}
