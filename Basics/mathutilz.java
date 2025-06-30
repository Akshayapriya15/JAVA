class kutty {
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int substract(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiple(int n1, int n2) {
        if (n2 == 0) {
            return 0;
        } else {
            return n1 * n2;
       }

    }
  public static int divide(int n1,int n2){
        if (n2 == 0) {
            System.out.println("arithimetic exception");
            return 0;
        } else {
            return n1 / n2;
        }
    }
}
public class mathutilz {
    public static void main(String[] args) {
        System.out.println("addition : " + kutty.add(5, 6));
        System.out.println("substraction : " + kutty.substract(5, 6));
        System.out.println("multiplication : " + kutty.multiple(5, 6));
        System.out.println("division : " + kutty.divide(4,2));

    }
}
