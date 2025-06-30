class college {
    static String coll;
    String name;
    int rollno;

    college(String name ,int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public static void setcollege(String name) {
        coll = name;
    }

    public void display() {
        System.out.println("name : " + name);
        System.out.println("rollno :" + rollno);
        System.out.println("college :" + coll);
    }
}

public class collegename{
    public static void main(String[] args) {
        college c1 = new college("aki",21);
        
        college c2 = new college("akshaya",22);
        college.setcollege("SA ENGINEERING COLLEGE");
        c1.display();
        c2.display();
    }
}
