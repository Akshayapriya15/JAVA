public class countlongnames {
    public static void main(String[] args) {
        String str[] ={"akshayapriya","aki","janani","swetha"};
        
        for (int i = 0; i < str.length; i++) {
            if(str[i].length() > 5)
                System.out.println(str[i]);
            }
        }
    }
