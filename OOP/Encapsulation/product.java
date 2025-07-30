class products{
    private int productid;
    private String name;
    private double price;

    public void setdetails(int productid, String name, double price) {
        this.productid = productid;
        this.name = name;
        this.price = price;
    }

    public int getid() {
        return productid;
    }

    public String getname() {
        return name;
    }
    public double getprice() {
        return price;
    }
}
    
public class product {
    public static void main(String args[]) {
        products obj[] = new products[2];
          for(int i =0; i < obj.length;i++){
          obj[i] = new products();
        }

        obj[0].setdetails(2345, "aki product ", 24.50);
        obj[1].setdetails(2, "vishva product ", 25.50);
        for (products n : obj) {
            System.out.println(n.getid() + " : " + n.getname() + " : " + n.getprice());
        }
    }
}
