class palindromef {
    public static void main(String[] args) {
        int n = 121;
        int digit;
        int original = n;
        int sum = 0;
        for (; n > 0;) {
            digit = n % 10;
            sum = sum * 10 + digit;
            n = n/ 10;
        }
        if (original == sum) {
            System.out.println("palindrome: " + sum);
        }else
             System.out.println("Not a palindrome: "+sum);
    }
}