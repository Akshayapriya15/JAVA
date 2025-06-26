public class frequencystr {
    public static void main(String[] args) {
        String str = "programming";
          str = str.toLowerCase();
         int fre[] = new int[26];

          for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
          fre[ch - 'a']++;// fre[ch - 'a'] = fre[ch - 'a'] + 1; // ascii value of a = 97  z = 122
         }
        for(int i =0; i < 26 ;i++){
        if(fre[i] > 0){
          System.out.print((char) (i + 'a') +": "+ fre[i] +" " );
        }
        }
       // int freq[] = new int[256];
       // for (int i = 0; i < str.length(); i++) {
         //   char ch = str.charAt(i);
           // freq[ch]++;
       // }
        //for (int i = 0; i < 256; i++) {
          //  if (freq[i] > 0) {
            //    System.out.print( (char)i + " : "+ freq[i]+ " ");
           // }
       // }
    }
}
