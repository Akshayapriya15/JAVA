import java.util.Scanner;

public class searchmethod {
    String name;
    int rollno;
    int marks;

    searchmethod(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public void display() {
        System.out.println("name : " + name);
        System.out.println("rollno : " + rollno);
        System.out.println("marks : " + marks);
        System.out.println("-----------------------");
    }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        searchmethod sear[] = new searchmethod[3];
       // searchmethod s1 = new searchmethod("aki", 1, 23);
       //sear[0] = s1;
       sear[0] = new searchmethod("aki", 1, 50);
       sear[1] = new searchmethod("vishva", 2, 80);
       sear[2] = new searchmethod("akshaya", 3, 40);
       for (searchmethod s : sear) {
           s.display();
       }
       boolean search = false;
       for (int i = 0; i < sear.length; i++) {
           if (target == sear[i].rollno) {
               System.out.println("found");
               sear[i].display();
               search = true;
               break;
           }
       }
       if (!search) {
           System.out.println("not found");
       } 
        
       sc.close();  

    }
}
