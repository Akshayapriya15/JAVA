class block {
    static int count;
    static {
        count = 100;
        System.out.println(block.count);
    }
}



public class staticblockint {
    public static void main(String[] args) {
      //  block obj = new block();// without this static block is not called
        System.out.println( block.count);
    }
}