public class stringf {
    public static void main(String[] args) {

        String str = "java";
          String m ="";
          for (int i = str.length() - 1; i >= 0; i--) {// -1 because lenth start from 1 so 4 but system count as 5 it start from 0 so were are putting -1
              m += str.charAt(i);
          }
          System.out.print(m);
            
    }
}
