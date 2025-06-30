public class compressstring {
    public static void main(String[] args) {
        String input = "aaabbbcc";
        int freq[] = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.print((char) (i + 'a') + "" + freq[i]);
            }
        }

    }
}
