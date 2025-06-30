public class vowelstringarray {
    public static void main(String[] args) {
        String sr[] = { "apple", "banana", "orange", "jackfruit" };
        int count = 0;
      //  int m = 0;
        String str = "aeiouAEIOU";
        for (int i = 0; i < sr.length; i++) {
            char ch = sr[i].charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                //  switch (ch) {
                //    case 'a', 'e', 'i', 'o', 'u' -> count++;
                //  default -> m++;
                // }
            }
        }
        System.out.println(count);

    }
}
