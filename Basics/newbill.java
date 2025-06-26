public class newbill {
    public static void main(String[] args) {
        int n = 100;
        String result;
        switch (n) {
            case 100, 200 -> result = "one unit";
            case 300, 400 -> result = "two unit";
            case 500, 600 -> result = "three unit";
            case 700, 800 -> result = "four unit";
            default ->result = "five unit";
        }
        System.out.println(result);
    }
}
