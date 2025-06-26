public class newseason {
    public static void main(String[] args) {
        int winter = 4;
        String result;
        result = switch(winter) {
            case 1, 12, 2 -> "winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 ->"summer";
            case 9, 10, 11 -> "Rainny";
            default -> "default Question:\n";
        };
        System.out.println(result);
    }
}
