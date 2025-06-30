class bankstatic {
    static int balance;
    static String holder;

    public static void deposit(int amount) {
        if (balance == 0) {
            System.out.println("No money");
            //return 0;
        } else {
            balance = balance + amount;
            System.out.println("amount :" + amount);
            //return balance;
        }
    }

    public static void withdraw(int amount) {
        if (balance == 0) {
            System.out.println("No money");
         //  return 0;
        } else {
            balance = balance - amount;
            System.out.println("amount :" + amount);
           // return balance;
        }
    }

    public static void display(){
        System.out.println("holder : " + holder);
        System.out.println("balance : "+ balance);

    }
}


public class staticbank {
    public static void main(String[] args) {
        
        bankstatic.balance = 1000;
        bankstatic.holder = " aki";
         bankstatic.display();
        bankstatic.deposit(500);
      //  System.out.println(bankstatic.withdraw(500));// we can print in main method only we use return;
        bankstatic.withdraw(300);
        bankstatic.display();
    }
}
