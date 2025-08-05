import java.util.Scanner;
class Department {
 private String Deptname;
 private Course course;
 private Professor professor;

 public Department(String Deptname) {
     this.Deptname = Deptname;
 }

 public void setCourse(Course course) {
     this.course = course;
     if (course.getDepartment() != this) {
         course.setDepartment(this);
     }
 }

 public Course getCourse() {
     return course;
 }

 public void setProfessor(Professor professor) {
     this.professor = professor;
     if (professor.getDepartment() != this) {
         professor.setDepartment(this);
     }
 }

 public Professor getProfessor() {
     return professor;
 }

 public String getName() {
     return Deptname;
 }

 public void display() {
     System.out.println("Department name : "+ Deptname);
     System.out.println("Professor name : "+ professor.getName());
     System.out.println("Course name : " + course.getName());
     System.out.println("---------------------------------------------------------------");
 }
}

class Course {
    private String coursename;
    private Department department;
    private Professor professor;

    public Course(String coursename) {
        this.coursename = coursename;
    }

    public void setDepartment(Department department) {
        this.department = department;
        if (department.getCourse() != this) {
            department.setCourse(this);
        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        if (professor.getCourse() != this) {
            professor.setCourse(this);
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getName() {
        return coursename;
    }
     public void display() {
     System.out.println("Course name : "+ coursename);
     System.out.println("department name : "+ department.getName());
     System.out.println("Professor name : " + professor.getName());
     System.out.println("---------------------------------------------------------------");
 }


}

class Professor {
    private String profesname;
    private Department department;
    private Course course;

    public Professor(String profesname) {
        this.profesname = profesname;
    }

    public void setDepartment(Department department) {
        this.department = department;
        if (department.getProfessor() != this) {
            department.setProfessor(this);
        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setCourse(Course course) {
        this.course = course;
        if (course.getProfessor() != this) {
            course.setProfessor(this);
        }
    }

    public Course getCourse() {
        return course;
    }

    public String getName() {
        return profesname;
    }
    public void display() {
     System.out.println("Professor name : "+ profesname);
     System.out.println("department name : "+ department.getName());
     System.out.println("Course name : " + course.getName());
     System.out.println("---------------------------------------------------------------");
 }
}

public class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department d1 = new Department(sc.next());
        Course c1 = new Course(sc.next());
        Professor p1 = new Professor(sc.next());
        d1.setCourse(c1);
        d1.setProfessor(p1);
        c1.setProfessor(p1);
        d1.display();
        c1.display();
        p1.display();
    }
}
