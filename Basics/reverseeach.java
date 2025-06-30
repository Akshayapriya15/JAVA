public class reverseeach {
    public static void main(String[] args) {
        String[] str = { "apple", "banana", "orange" };
        String result = "";
        for (int i = 0; i < str.length; i++) {
            
            for (int j = (str[i].length() - 1); j >= 0; j--) {
                char ch = str[i].charAt(j);
                result += ch;

            }
            System.out.print(result + " ");
            result = "";
        }
        
           
        }

    }

