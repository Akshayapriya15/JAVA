public class circle {
    double radius;
    double a;
    public circle(double r) {
        radius = r;
    }

    public double area() {
        a = radius * radius * Math.PI;
        return a;
    }

    public double circumference() {
        a = 2 * Math.PI * radius;
        return a;
    }

    public void display() {
        System.out.println("area :" + area());
        System.out.println("circumference :" + circumference());
    }
    public static void main(String[] args) {
        circle cir = new circle(7.0);
         cir.display();
    }}

