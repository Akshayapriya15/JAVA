public class overf {
    public int area(int side) {
 
       
        return side * side;
    }

    public int area(int length, int breadth) {
        return length * breadth;
    }

    public double area(double radius) {
        return radius * radius * Math.PI;
    }

   // public void display() {
    // System.out.println("The area of circle :" + area(5));
     // System.out.println("The area of circle :" + area(5,7));
        // System.out.println("The area of circle :" + area(5.0));
   // }
    
    public static void main(String[] args) {
        overf obj = new overf();
        // obj.display();
        System.out.println("The area of square : " + obj.area(8));
        System.out.println("The area of rectangle : " + obj.area(9,8));
      System.out.println("The area of circle : " + obj.area(9.0));
    }}

