class Bank{
    private String accountNumber;
    private int balance;

    public void setDetails(String account, int bal) {
        accountNumber = account;
        balance = bal;
    }

    public void Deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(" deposit : " + amount);
        }else if (amount <= 0) {
            System.out.println("INVALID AMOUNT negative numbers");
        } else {
            System.out.println(" Balance = 0 ");
        }
    }

    public void Withdraw(int amount) {
        if (amount > balance) {
           System.out.println("INVALID AMOUNT :" + balance);
        } else if(amount <= 0) {
            System.out.println(" Negative Values not accepted ");
        }else{
         balance = balance - amount;
            System.out.println( "withdraw : " +amount);
    }
}

    public void display() {
        System.out.println("balance :  " + balance);
        System.out.println("account no : " + accountNumber);
    }


}
  
  
  
public class Bankaccount {
    public static void main(String[] args){
        Bank b = new Bank();
        b.setDetails("23dhgn", 1000);
        b.display();
        b.Deposit(500);
        b.Deposit(-100);
        b.Withdraw(300);
        b.Withdraw(-200);
        b.display();
    }
    
}
