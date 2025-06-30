class staticblock {
    static {
        System.out.println("app starting ...");
    }

}

public class executeblock {
    public static void main(String[] args) {
        staticblock obj = new staticblock();
        System.out.println("Main block executed");
    }
}
