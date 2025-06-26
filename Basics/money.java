public class money {
    public double inrtousd(double inr) {
        return inr / 83;
    }

    public double inrtoeur(double inr) {
        return inr / 90;
    }

    public void display(double in) {
        System.out.println("tousd :" + inrtousd(in));
        System.out.println("toeur : " + inrtoeur(in));
    }
    public static void main(String[] args) {
        money m = new money();
        m.display(1000);
    }
}
