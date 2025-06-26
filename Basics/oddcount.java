public class oddcount {
    public static void main(String[] args) {
    int[][] arr = {
        {2,6},
        {4,5}        
    };
    int even = 0;
    int odd = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            if (arr[i][j] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
    }
    System.out.println("even count : " + even);
    System.out.println("Odd count : " + odd);
}
}
