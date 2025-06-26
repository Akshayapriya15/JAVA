public  class Bank{
    int accountno;
    int balance;

    public void setdetails(int account, int bal) {
        accountno = account;
        balance = bal;

    }
    public void deposit(int amount ){
    
        balance = balance + amount;
     System.out.println(  " deposit: "  + balance);
    }

    public void withdraw( int withdraw) {
        balance = balance - withdraw;
        System.out.println(" withdraw" +balance);
    }

    public void displaydetail() {
        System.out.println("Account Number :" +accountno);
        System.out.println("balance : " + balance);
    }
    public static void main(String[] args){
        Bank obj = new Bank();
        obj.setdetails(2345, 1000);
        obj.displaydetail();
       obj.deposit(500);
       obj.withdraw(200);
       obj.displaydetail();
    }

}