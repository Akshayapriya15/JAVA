public class targetstring {
    public static void main(String[] args) {
        String[] name = { "cat", "fish", "meow" };
        String dog = "dog";
        boolean n = true;
        for (int i = 0; i < name.length; i++) {
            if (name[i].contains(dog)) {
                n = false;
            }

        }
          if (!n){
            System.out.println("true");

          }else{
            System.out.println("false");
          }
    }}

