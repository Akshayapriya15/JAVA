class count {
    static int count;

    count() {
        count++;
    
    }
}

   public class countobject{
    public static void main(String[] args) {
        count obj1 = new count();
         count obj2 = new count();
         count obj3 = new count();
          System.out.println("count : "+count.count);
        
    }
}
