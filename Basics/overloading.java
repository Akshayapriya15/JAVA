public class overloading {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
    public static void main(String[] args) {
        overloading over = new overloading();
        //   double r1 = over.add(5.0, 6);
      //int r1 = over.add(5.0, 6);
        System.out.println(over.add(5.0,4));
    }
}
