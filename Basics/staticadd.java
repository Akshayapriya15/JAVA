

class meow {
   static int n1;
   static int n2;

    public static int add() {
        return n1 + n2;
    }

    public void display() {
        System.out.println("add two number : " +  add());//same class means we can call static method in non static method
    }

}



public class staticadd {
    public static void main(String[] args) {
        meow m = new meow();
        meow.n1 = 12;
        meow.n2 = 4;
        m.display();
    
        
    }
}
