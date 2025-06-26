public class bankf {
    String accountno;
    int balance;

  //  bankf(String n, int bal) {
    //    accountno = n;
      //  balance = bal;
    //}

    void deposit(int n) {
        if (balance > 0) {
            balance = balance + n;
            System.out.println("deposit :" + balance);
        } else {
            System.out.println(" balance = 0");
        }
    }

    void withdraw(int n) {
        if (balance > 0) {
            balance = balance - n;
            System.out.println("withdraw: " + balance);
        } else {
            System.out.println("balance = 0");
        }
    }

    void display() {
        System.out.println("account no : " + accountno);
        System.out.println("balance : " + balance);
        
     }

     public static void main(String[] args) {
         bankf obj = new bankf();
         obj.accountno = "a234";
         obj.balance = 1000;

         obj.display();
         obj.deposit(500);
        
         obj.withdraw(200);
           obj.display();
     }
}
