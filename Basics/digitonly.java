public class digitonly {
    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "12a3s3";
        boolean check = false;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!Character.isDigit(ch)) {
                check = true;
                System.out.println(str1 +"false");
                break;

            }
        }
        if (!check) {
            System.out.println(str1 + " true");
        }
        boolean check1 = false;
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (!Character.isDigit(ch)) {
                check1 = true;
                System.out.println(str2 + " false");
                break;
            }

        }
        if (!check1) {
            System.out.println(str2 + " true");
        }
        
    }
    }

