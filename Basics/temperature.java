public class temperature {
    public static void main(String[] args) {

        int x = 100;
        String temp;
        temp = x < 0 ? "ice" : x > 0 && x < 9 ? "cold" :x > 10 && x < 30 ? "hot" : "very hot";
        System.out.println(temp);
    }
}

