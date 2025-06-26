

public class sortroll {
    String name;
    int rollno;
    int marks;

    sortroll(String name, int rollno, int marks) {
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

        sortroll sear[] = new sortroll[3];
        // searchmethod s1 = new searchmethod("aki", 1, 23);
        //sear[0] = s1;
        sear[0] = new sortroll("aki", 3, 50);
        sear[1] = new sortroll("vishva", 1, 80);
        sear[2] = new sortroll("akshaya", 2, 40);
        int temp = 0;
        for (int i = 0; i < sear.length; i++) {
            for (int j = i+1; j < sear.length; j++) {
                if (sear[i].marks < sear[j].marks) {
                temp = sear[i].marks;
                sear[i].marks = sear[j].marks;
                sear[j].marks = temp;
            }
        }

        }
       for (sortroll s : sear) {
            s.display();
        }
    }
}