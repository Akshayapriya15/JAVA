

class voice {
    private String customer;
    private double amount;
    private double taxRate;

    voice(String customer, double amount,double taxRate) {
        this.customer = customer;
        this.amount = amount;
        settaxRate(taxRate);
       // this.taxRate = settaxRate(taxRate);
    }

    public void settaxRate(double tax) {
        if (tax <= 5 && tax >= 28) {
            System.out.println("No tax is allowed");
        } else {
           this.taxRate = tax;
            //return tax;
        }
    }

     public double getTotal() {
    amount = amount + (amount * taxRate / 100);
    return amount;
   }

public void display() {
    System.out.println("Customername : " + customer);
    System.out.println(" amount : " + amount);
    System.out.println(" tax: " + taxRate + " %");
    System.out.println(" totalamount : " +   getTotal() );

    }

    }

public class Invoice {
    public static void main(String[] args) {
        voice v = new voice("aki", 3000.0, 18);
        v.display();
    }
}
