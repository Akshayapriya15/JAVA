public class currency {
    public double inrtousd(double inr) {
        return inr * 83;
    }

    public double usdtoinr(double usd) {
        return usd / 83;
    }

    public double inrtoeur(double inr) {
        return inr * 90;
    }

    public double eurtoinr(double eur) {
        return eur / 90;
    }

    public void display(double inr,double usd,double eur) {
        System.out.println(" inr  to usd : " + inrtousd(inr));
        System.out.println("usd to inr :" + usdtoinr(usd));
        System.out.println("inr to eur :" + inrtoeur(inr));
        System.out.println("eur to inr : " + eurtoinr(eur)); 
    }
    public static void main(String[] args) {
        currency s1 = new currency();
      //  s1.inrtousd(70);
        //s1.usdtoinr(70);
       // s1.eurtoinr(70);
        //s1.inrtoeur(70);
        s1.display(1000,1000,1000);
    }
}