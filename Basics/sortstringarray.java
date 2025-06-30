public class sortstringarray {
    public static void main(String[] args) {
        String[] arr = { "banana", "carrot", "apple" };
        int fre[] = new int[26];
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);
            fre[ ch - 'a'] = fre[ch - 'a'] + 1;
        }
        for (int i = 0; i < 26; i++) {
            if (fre[i] > 0) {
                for (int j = 0; j < arr.length; j++) {
                    char ch = arr[j].charAt(0);
                    char c = (char) (i+ 'a');
                    if ( c==ch) {
                        System.out.println((arr[j]));
                        break;
                        
                    }
                }
            }
        }
    }
}
