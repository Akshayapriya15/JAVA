class stud {
    private String name;
    private int rollno;
    private int marks;

    stud(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getrollno() {
        return rollno;
    }

    public int getmarks() {
        return marks;
    }

    public void display() {
          System.out.println(getName() + " : " + getrollno() + " : " + getmarks());
    }

}   
   
public class students {
    public static void main(String[] args) {
        stud s = new stud("aki", 1, 90);
       s.display();
    }}

