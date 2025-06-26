class students {
    String names;
    int rollnos;
    int mark;

    public void setdisplay(String name, int rollno, int marks) {
        names = name;
        rollnos = rollno;
        mark = marks;
    }

    public void display() {
        System.out.println("name :" + names);
        System.out.println("rollno : " + rollnos);
        System.out.println("marks : " + mark);
        System.out.println("-------------------");
    }
}

public class arrray {
    public static void main(String[] args) {
        students student[] = new students[3];
        for (int i = 0; i < student.length; i++) {
            student[i] = new students();
        }
        student[0].setdisplay("aki", 123, 90);
        student[1].setdisplay("yuva", 123, 90);
        student[2].setdisplay("akshaya", 123, 90);
        for (students s : student) {
            s.display();
        }
    }
}
