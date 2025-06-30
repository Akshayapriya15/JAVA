import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        String[] arg = {"orange", "apple", "banana"};
        Arrays.sort(arg);
        for (String c : arg) {
            System.out.print(c + " ");
        }
    }
}
