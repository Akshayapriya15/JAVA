class calculator {
    int r;

    public int add(int n1, int n2) {
        //r = n1 + n2;
        return n1 + n2;
    }

    public int multiply(int n1, int n2) {
        r = n1 * n2;
        return r;
    }

    public int sub(int n1, int n2) {
        r = n1 - n2;
        return r;
    }

    public int divided(int n1, int n2) {
        if (n1 != 0) {
            r = n1 / n2;
            return r;
        } else {
            System.out.println("Arithimetic error");
            return 0;
        }
    }

}

public class methods{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        calculator cal = new calculator();
        
        
        System.out.println("5 + 6 = " + cal.add(num1, num2));
        System.out.println("5 - 6 = " + cal.sub(num1, num2));
        System.out.println("5 * 6 = " + cal.multiply(num1, num2));
        System.out.println("5 / 6 = " + cal.divided(num1, num2));
    }
}
