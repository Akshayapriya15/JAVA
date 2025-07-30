class Classroom {
    private String number;
    private String grade;
    private Teacher teacher;

    public Classroom(String name, String subject) {
        this.number = name;
        this.grade = subject;
    }

    public void setTeacher(Teacher teach) {
        this.teacher = teach;
        if (teacher.getClassroom() != this) {
            teacher.setClassroom(this);
        }
    }

    public Teacher getTeacher() {

        return teacher;
    }

    public String getNumber() {
        return number;
    }

    public String getGrade() {
        return grade;
    }

    public void display() {
         System.out.println("number :" + number);
        System.out.println("grade" + grade);
        System.out.println("teacher name : " + teacher.getName());
        System.out.println("teacher subject: " + teacher.getSubject());
    }
}

class Teacher {
    private String name;
    private String subject;
    private Classroom classroom;

    public Teacher(String number, String grade) {
        this.name = number;
        this.subject = grade;
    }

    public void setClassroom(Classroom classroom){
        this.classroom = classroom;
        if(classroom.getTeacher()!=this){
            classroom.setTeacher(this);
        }

    }

    public Classroom getClassroom() {
        return classroom;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void display() {
        System.out.println("name :" + name);
        System.out.println("subject :" + subject);
        System.out.println("Classroom number : " + classroom.getNumber());
        System.out.println("Classroom grade : " + classroom.getGrade());
    }
}


public class Biteacher {
    public static void main(String[] args) {
        Classroom d = new Classroom("245d", "10th std");
        Teacher n = new Teacher("Aki", "Science");
        d.setTeacher(n);
        d.display();
        n.display();
    }}

