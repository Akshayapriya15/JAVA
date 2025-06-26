class areacalculator {
    
    
    public int square(int s) {
      int  r = 4 * s;
        return r;
    }

    public void rect(int n1, int n2) {
       int r = n1 * n2;
        System.out.println("area of rectangle :" + r);
    }

    public void circle(double radius) {
       double w = radius* Math.PI * radius;
       System.out.println("area of circle :" + w);
    }
}
     public class areaf{ 
         public static void main(String[] args) {
            
             int side = 20;
             double radius = 4.5;
             areacalculator cal = new areacalculator();
             System.out.println("area of square : " + cal.square(side));
            cal.rect(10,20);
             cal.circle(radius);
         }
}
