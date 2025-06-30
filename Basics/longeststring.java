public class longeststring {
    public static void main(String[] args) {
        String str = " java is a super powerful";
        String str1[] = str.split(" ");
        String longest = "";
        for(int i =0; i< str1.length;i++) {
            if (str1[i].length() > longest.length()) // longest = 0 then str1 is applied to longest
                longest = str1[i];
        }
           System.out.println(longest);
            
        }}
    
