public class amf 
 {
    public static void main(String[] args) {
        int n = 152;
        int original = n;
        int digits = n % 10;
        int digit = 0;
        int sum = 0;
        for ( n = 153; n > 0;) {
            if(n >0)
             digit = n % 10;
            sum += Math.pow(digit, digits);
            n = n / 10;
        }
        if(sum == original)
            System.out.println("Armstrong: " + sum);
        else 
            System.out.println("Not a Armstrong: " + sum);

    }  
    }


