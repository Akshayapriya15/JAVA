public class longestword {
    public static void main(String[] args) {
        String str = "java is a powerful";
        String str1[] = str.split(" ");
        int a[] = new int[str1.length];

        int count = 0;
        int j =0;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {

                a[j] = count++;
            } else {
                count = 0;
                j++;
            }

        }
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;

            }

        }
        System.out.println(str1[max]);
  
    }
}

