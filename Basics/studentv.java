class student {
    String name;
    int rollno;
    int marks;

    student(String name,int rollno,int marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public void display()
    {
        System.out.println("name : " + name);
        System.out.println("name : " + rollno);
        System.out.println("name : " + marks);
        System.out.println("------------------------------");

    }
}
public class studentv {
    public static void main(String[] args) {
        student stud[] = new student[3];
        stud[0] = new student("akshaya",123,90);
        stud[1] = new student("aki",345,90);
        stud[2] = new student("vishva", 78, 90);

       for (int i = 0; i < stud.length; i++) {
           stud[i].display();
        }
    //    for (student s : stud) {
      //      s.display();
       //}
    }
}

