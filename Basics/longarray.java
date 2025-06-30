public class longarray {
    public static void main(String[] args) {
    
        StringBuilder longest = new StringBuilder();
        String name[] = { "apple", "banana", "pineapple", "orange" };
        int max = 0;
        for (int i = 1; i < name.length; i++) {
            if (name[i].length() > name[max].length()) {
                max = i;
            }

        }
        System.out.println(name[max]);
        
                   
            
        }
    }

