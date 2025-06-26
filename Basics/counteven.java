public class counteven {
    public static void main(String[] args) {
        int num[] = { 1, 2, 8, 7, 6, 5, 4, 3, 9 };
        int sum = 0;
        int odd = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                sum++;
            }
            else {
                odd++;
            }

        }
        System.out.println("count even:" + sum);
        System.out.println("count odd:" + odd);
    }
    }

