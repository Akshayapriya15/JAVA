public class frequencystring {
    public static void main(String[] args) {
        String str = "programming";
    
        boolean[] arr = new boolean[str.length()];
        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i]) {
                continue;
            }
            int count = 1;
            for (int j = i+1; j <= str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    arr[j] = true;
                    count++;
                }
            }
              
            System.out.print (str.charAt(i) +" : "+ count +" ");
        }
        
}

}
