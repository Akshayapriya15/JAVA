public class operatormethods {
    
    int sum;

    public void setvalues(int n2) {
        
        sum = n2;
    }

    public void add(int n1) {
        sum = sum + n1;
        System.out.println("The add is" + sum);
    }

    public void sub(int n1) {
        sum = sum - n1;
        System.out.println("the sub is :" + sum);
    }

    public void mul(int n1) {
        sum = sum * n1;
        System.out.println("mul sum: " + sum);
    }
    
    public void display() {
        System.out.println(sum);
    }
    public static void main(String[] args) {
        operatormethods obj = new operatormethods();
        obj.setvalues(100);
        obj.display();
        obj.add(100);
        obj.sub(50);
        obj.mul(2);
        obj.display();
    }
}
