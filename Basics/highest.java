public class highest {
    String name;
    int rollno;
    int marks;

    public void setdetails(String names, int roll, int mark) {
        name = names;
        rollno = roll;
        marks = mark;
    }

    public void display() {
        System.out.println("name : " + name);
        System.out.println("rollno : " + rollno);
        System.out.println("marks : " + marks);
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        highest high[] = new highest[3];
        high[0] = new highest();
        high[1] = new highest();
        high[2] = new highest();
      //highest h1 = new highest();
     // high[0] = h1;
       // highest h2 = new highest();
       // high[1] = h2;
      // highest h3 = new highest();
     // high[2] = h3;


        high[0].setdetails("akshayapriya", 34, 70);
        high[1].setdetails("akshaya", 34, 90);
        high[2].setdetails("aki", 34, 89);
        for (highest h : high) {
            h.display();
        }
        int max = 0;
        for (int i = 1; i < high.length; i++) {
            if (high[i].marks > high[max].marks) {
                max = i;
            }

        }
        System.out.println("The highest score student is");
        high[max].display();

    }}

