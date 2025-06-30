class B {
    static {
        System.out.println("I am B class ");
    }

         B() {
            System.out.println(" I am B class constructor");
    }
}

class A {
    static {
        System.out.println("I am A class");
    }

}
 public class Mainclass {
    public static void main(String[] args) {

        B obj = new B();

    }
    
}
